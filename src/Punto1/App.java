/*
Escribir un programa en el que se inicie un arreglo con diez palabras relacionadas a la informática. De
manera aleatoria, seleccionar cinco palabras del arreglo y guardarlas en una pila en el orden en que fueron
seleccionadas. Luego, solicitar al usuario que ingrese N palabras, las cuales deberán ser eliminadas de la
pila cuando existan en ella y conservar las demás sin perder el orden inicial.
Por lo tanto, para cada una de las palabras ingresadas se debe verificar si está presente en la pila, en caso
afirmativo, se la elimina. Para esto, deberá usar una pila auxiliar a fin de no perder elementos. El programa
finaliza cuando se analizan las N palabras o cuando la pila haya quedado vacía. Además, debe informar
cuantas palabras fueron eliminadas y mostrar las palabras que hayan quedado en la pila original (en caso
que no haya quedado vacía).
 */

package Punto1;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Random random = new Random();
        Scanner entrada = new Scanner(System.in);

        String[] palabras = {"Algoritmo", "Byte", "Cloud", "Hacker", "Internet", "Software", "Programacion", "CPU", "GPU", "LAN"};
        

        Stack pilaAleatoria = pilaAleatoria(palabras, random);
        System.out.println(pilaAleatoria);
        Stack<String> pilaAuxiliar = new Stack<>();

        /*solicitar al usuario que ingrese N palabras, las cuales deberán ser eliminadas de la pila cuando existan en ella y conservar las demás sin perder el orden inicial. */

        pilaAleatoria = eliminarPalabras(entrada, pilaAleatoria, pilaAuxiliar);
        System.out.println(pilaAleatoria);

    }

    public static Stack pilaAleatoria(String[] palabras, Random random){
        Stack<String> pila = new Stack<>();
        for (int i = 0; i < 5; i++) {
            pila.push(palabras[random.nextInt(10)]);
        }
        return pila;
    }

    public static Stack eliminarPalabras (Scanner entrada, Stack<String> pilaAleatoria, Stack<String> pilaAuxiliar){
        System.out.println("¿Cuantas palabras desea eliminar?: ");
        int n = entrada.nextInt();
        entrada.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la palabra a eliminar: ");
            String palabra = entrada.nextLine();

            while(!pilaAleatoria.empty()){
                String elemento = pilaAleatoria.pop();
                if(!elemento.equals(palabra)){
                    pilaAuxiliar.push(elemento);
                }
            }

            while(!pilaAuxiliar.empty()){
                pilaAleatoria.push(pilaAuxiliar.pop());
            }

        }
        return pilaAleatoria;
    }
}
