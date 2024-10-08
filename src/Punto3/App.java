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
        menu(entrada, gps);
        System.out.println(gps);

    }

    public static void menu(Scanner entrada, GPS gps){
        int decision;

        while(true){
            System.out.println(
            "1- Agregar nueva ruta\n"+
            "2- Deshacer ultima ruta \n"+
            "3- Rehacer ruta deshecha \n"+
            "4- Ver ruta actual\n"+
            "5- Ver historial completo\n"+
            "6- Salir"
        );

            decision = Helper.getInteger("Ingrese el numero de la opcion que desea hacer: ", "Ingrese un valor valido");

            switch (decision) {
                case 1:
                    agregarNuevaRuta(entrada, gps);
                    break;
                case 2:
                    deshacerUltimaRuta(gps);
                    break;
                case 3:
                    rehacerRutaDeshecha(gps);
                    break;
                case 4:
                    verRutaActual(gps);
                    break;
                case 5:
                    verHistorialCompleto(gps);
                    break;
                case 6:
                    System.out.println("Saliendo . . .");
                    return;
                }
        }
    }

    public static void agregarNuevaRuta(Scanner entrada, GPS gps){
        System.out.println("Ingrese el origen de la nueva ruta: ");
        String origen = entrada.nextLine();

        System.out.println("Ingrese el destino de la nueva ruta: ");
        String destino = entrada.nextLine();

        System.out.println("Ingrese la distancia en km: ");
        int distancia = entrada.nextInt();
        entrada.nextLine();

        Ruta ruta = new Ruta(origen, destino, distancia);
        gps.agregarRuta(ruta);

        System.out.println(gps);
    }

    public static void deshacerUltimaRuta(GPS gps){
        System.out.println("Deshaciendo ultima ruta . . .");
        gps.deshacerRuta();
    }

    public static void rehacerRutaDeshecha(GPS gps){
        System.out.println("Rehaciendo ruta deshecha . . .");
        gps.rehacerRuta();
    }

    public static void verRutaActual(GPS gps){
        gps.verRutaActual();
    }

    public static void verHistorialCompleto(GPS gps){
        gps.verHistorialCompleto();
    }
}
