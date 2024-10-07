/*
Crear un programa para el sistema de manejo de rutas en un GPS utilizando una estructura de datos pila.
Este sistema debe permitir a los usuarios agregar nuevas rutas, deshacer la última ruta agregada, rehacer
una ruta deshecha y visualizar la ruta actual. También debe existir la opción para ver el historial completo
de las rutas
 */

package Punto3;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        GPS gps = new GPS();
        menu(entrada);

    }

    public static void menu(Scanner entrada){
        int decision;

        while(true){
            System.out.println(
            "1- Agregar nueva ruta\n"+
            "2- Deshacer ultima ruta \n"+
            "3- Rehacer ruta deshecha \n"+
            "4- Ver ruta actual\n"+
            "5- Salir"
        );

            decision = Helper.getInteger("Ingrese el numero de la opcion que desea hacer: ", "Ingrese un valor valido");

            switch (decision) {
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    System.out.println("Saliendo . . .");
                    return;
                }
        }
    }
}
