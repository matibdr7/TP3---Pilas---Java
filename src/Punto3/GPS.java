    package Punto3;

    public class GPS {
        private Stack pilaRutas;
        private Stack pilaDeshacer;

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

    }
