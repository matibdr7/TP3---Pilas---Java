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

public class App {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        Stack deshacer = new Stack<>();
        Stack rehacer = new Stack<>();

        menu(entrada, deshacer, rehacer);
    }

    public static void menu(Scanner entrada, Stack deshacer, Stack reacher){
        System.out.println(
            "---- MENU ----\n"+
            "1- Rehacer\n"+
            "2- Deshacer\n"+
            "3- Salir"
        );

        int decision = Helper.getInteger("Ingrese lo que desee hacer: ", "Ingrese un valor numerico valido");

        switch (decision) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Ingrese una opción valida");
                menu(entrada, deshacer, reacher);
        }
    }
}
