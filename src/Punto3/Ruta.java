package Punto3;

public class Ruta {
    private String origen;
    private String destino;
    private int distancia;

    public Ruta() {
    }

    public Ruta(String origen, String destino, int distancia) {
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return "origen: " + origen + ", destino: " + destino + ", distancia: " + distancia + "\n";
    }

}
