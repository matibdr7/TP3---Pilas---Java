//Esto es un comentario hecho con vim en Ubuntu

package ejemploLoco;

public class App {
    public static void main(String[] args){
        Stack miPila = new Stack<>();
        for (int i = 0; i < 6; i++) {
            miPila.push(i);
        }

        while(!miPila.empty()){
            System.out.println("Proximo elemento a salir: "+miPila.peek());
            System.out.println(miPila.pop());
        }

    }
}
