/*
 * Implementar la clase “SitioWeb” que posea los siguientes atributos: nombre, tipo (educativo,
entretenimiento, noticias o comercio electrónico) y url. Utilizar una pila para almacenar y recorrer el
historial de navegación de los sitios web visitados.

La operación de almacenar consiste en agregar sitios web a la pila, a petición del usuario. Recorrer el
historial consiste en navegar hasta el sitio web de interés (por nombre o url), pero sin perder la información
de los sitios previamente visitados (usar una pila auxiliar).
Crear un programa que facilite el acceso a ambas operaciones. Además, mostrar el total de sitios web
visitados e indicar cuantos corresponden a cada tipo.

 */

package Punto4;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Stack historial = new Stack<>();

        menu(entrada, historial);

    }

    public static void menu(Scanner entrada, Stack historial){
        int decision;
        while(true){
            System.out.println(
                "1- Agregar sitio web \n"+
                "2- Recorrer historial \n"+
                "3- Salir"
            );
            decision = Helper.getInteger("Ingrese la opcion que desea ejecutar", "Ingrese un valor numerico valido");

            switch (decision) {
                case 1:
                    agregarSitioWeb(entrada);
                    break;
                case 2:
                    recorrerHistorial();
                    break;
                case 3:
                    System.out.println("Saliendo . . .");
                    return;
                default:
                    System.out.println("Ingrese un valor valido del 1 al 3");
            }
        }

    }

    public static void agregarSitioWeb(Scanner entrada){

    }

    public static void recorrerHistorial(){

    }
}
