package Punto1;

public class Pila {
    private final int maximoTamano = 4;
    private int[] datos;
    private int cuenta;

    public Pila() {
        this.datos = new int[maximoTamano];
        this.cuenta = 0;
    }

    public void push(int elemento) {
        if (this.isFull()) {
            throw new RuntimeException("La pila está llena...");
        }
        this.datos[this.cuenta] = elemento;
        this.cuenta++;
    }

    public int pop() {
        if (this.isEmpty()) {
            throw new RuntimeException("La pila está vacía...");
        }
        this.cuenta--;
        return this.datos[this.cuenta];
    }

    public boolean isFull() {
        return this.cuenta == this.datos.length;
    }

    public boolean isEmpty() {
        return this.cuenta == 0;
    }

}
