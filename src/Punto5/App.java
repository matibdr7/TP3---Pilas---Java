/*
  Crear un programa que, mediante un menú, simule las operaciones de "deshacer" y "rehacer" en un editor
de texto utilizando dos pilas, una para cada operación. Las acciones que se pueden realizar sobre un
documento son: “negrita”, “cursiva”, “insertar tabla”, “subrayado”, “insertar imagen”, “escribir texto”,
“borrar texto”, entre otras.

Cada acción realizada sobre el documento se guarda en la pila “deshacer”. Generar de manera aleatoria un
número de acciones a deshacer (ese número no puede superar el tamaño de la pila), lo cual implica
remover dichas acciones de la pila “deshacer” y agregarlas a “rehacer”.

Por otra parte, rehacer una o más acciones, a petición del usuario, en tanto no se supere el tamaño de la
pila rehacer.

Finalmente informar cuantas acciones relacionadas al formato se rehicieron.
*/

package Punto5;
import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        Stack deshacer = new Stack<>();
        Stack rehacer = new Stack<>();

        menu(entrada, deshacer, rehacer, random);
    }

    public static void menu(Scanner entrada, Stack deshacer, Stack rehacer, Random random){
        while(true){
            System.out.println(
                "---- MENU ----\n"+
                "1- Hacer algo\n"+
                "2- Deshacer\n"+
                "3- Deshacer aleatoriamente\n"+
                "4- Rehacer\n"+
                "5- Mostrar pilas\n"+
                "6- Salir"
            );
            
            int decision = Helper.getInteger("Ingrese lo que desee hacer: ", "Ingrese un valor numerico valido");
            
            switch (decision) {
                case 1:
                    agregarAccion(entrada, deshacer);
                    break;
                case 2:
                    deshacerAccion(entrada, deshacer, rehacer);
                    break;
                case 3:
                    deshacerEnGrupo(entrada, deshacer, rehacer, random);
                    break;
                case 4:
                    rehacerAccion(entrada, deshacer, rehacer);
                case 5:
                    System.out.println("Deshacer: "+deshacer +" Rehacer: "+ rehacer);
                    break;
                case 6:
                    System.out.println("Saliendo . . .");
                    return;
                default:
                    System.out.println("Ingrese una opción valida");
                    menu(entrada, deshacer, rehacer, random);
            }
        }
    }

    public static void agregarAccion(Scanner entrada, Stack deshacer){
        System.out.println("Ingrese lo que desea hacer: “negrita”, “cursiva”, “insertar tabla”, “subrayado”, “insertar imagen”, “escribir texto”, “borrar texto”, etc");

        String accion = entrada.nextLine();
        deshacer.push(accion);
    }

    public static void deshacerAccion(Scanner entrada, Stack deshacer, Stack rehacer){
        if(!deshacer.empty()){
            rehacer.push(deshacer.pop());
        }else{
            System.out.println("No hay acciones para deshacer . . .");
            return;
        }
    }

    public static void rehacerAccion(Scanner entrada, Stack deshacer, Stack rehacer){
        int num = Helper.getInteger("¿Cuantas acciones desea rehacer?: ", "Ingrese un valor numerico valido");
        
        for (int i = 0; i < num; i++) {
            if(!rehacer.empty()){
                deshacer.push(rehacer.pop());
            }else{
                System.out.println("No hay más acciones para rehacer . . .");
            }
        }
    }

    public static void deshacerEnGrupo(Scanner entrada, Stack deshacer, Stack rehacer, Random random){
        int num = random.nextInt(deshacer.size());
        System.out.println("Random num = "+num);

        for (int i = 0; i < num; i++) {
            deshacerAccion(entrada, deshacer, rehacer);
        }
    }
}
