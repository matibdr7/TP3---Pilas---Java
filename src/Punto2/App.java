/*
Escribir un programa que permita al usuario ingresar un número entero de cuatro cifras. Se debe validar
que el número ingresado tenga exactamente cuatro cifras. Descomponer el número en dígitos y cargarlos
en una pila. Luego, quitar los dígitos de la pila y formar un nuevo número de cuatro cifras (el número
original al revés).
Por ejemplo, si el usuario ingresa el número 5432, se debe descomponerlo y cargar cada dígito en la pila.
Para este caso, se apilarían en el siguiente orden: 5, 4, 3 y 2. Al quitar los números de la pila se debe
componer el número entero 2345. Además, mostrar los dígitos pares e impares del número original.
 */

package Punto2;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Stack pila = new Stack<>();

        int num = ingresoNumero(entrada);
        pila = descomponerNumeroEnPila(entrada, num, pila);

        System.out.println(pila);
    }

    public static int ingresoNumero(Scanner entrada){
        int num = Helper.getInteger("Ingrese el numero de 4 cifras: ", "Ingrese un valor numerico valido");
        if(num<999 | num>9999){
            System.out.println("Ingrese un numero de 4 cifras");
            return ingresoNumero(entrada);
        }
        return num;
    }

    public static Stack descomponerNumeroEnPila(Scanner entrada, int num, Stack pila){
        int miles = num/1000;
        int centena = (num/100) % 10;
        int decena = (num/10) % 10;
        int unidad = (num) % 10;

        pila.push(unidad);
        pila.push(decena);
        pila.push(centena);
        pila.push(miles);

        return pila;
    }
}
