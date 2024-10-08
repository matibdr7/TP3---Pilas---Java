    package Punto3;

    public class GPS {
        private Stack<Ruta> pilaRutas = new Stack<Ruta>();
        private Stack<Ruta> pilaDeshacer = new Stack<Ruta>();

        public void agregarRuta(Ruta ruta){
            pilaRutas.push(ruta);
        }

        public void deshacerRuta(){
            pilaDeshacer.push(pilaRutas.pop());
        }

        public void rehacerRuta(){
            pilaRutas.push(pilaDeshacer.pop());
        }

        public void verRutaActual(){
            System.out.println(pilaRutas.peek());
        }

        public void verHistorialCompleto(){
            pilaRutas.toString();
        }

        @Override
        public String toString() {
            return "GPS Rutas: \n" + pilaRutas;
        }

    }
