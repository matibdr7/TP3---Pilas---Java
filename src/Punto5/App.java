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
        System.out.println(
            "---- MENU ----\n"+
            "1- Hacer algo\n"+
            "2- Deshacer\n"+
            "3- Deshacer aleatoriamente\n"+
            "4- Rehacer\n"+
            "5- Salir"
        );

        int decision = Helper.getInteger("Ingrese lo que desee hacer: ", "Ingrese un valor numerico valido");

        switch (decision) {
            case 1:
                agregarAccion(entrada, rehacer);
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.out.println("Saliendo . . .");
                return;
            default:
                System.out.println("Ingrese una opción valida");
                menu(entrada, deshacer, rehacer, random);
        }
    }

    /*“negrita”, “cursiva”, “insertar tabla”, “subrayado”, “insertar imagen”, “escribir texto”, “borrar texto” */

    public static void agregarAccion(Scanner entrada, Stack deshacer){
        System.out.println("Ingrese lo que desea hacer: “negrita”, “cursiva”, “insertar tabla”, “subrayado”, “insertar imagen”, “escribir texto”, “borrar texto”, etc");

        String accion = entrada.nextLine();
        deshacer.push(accion);
    }

}
