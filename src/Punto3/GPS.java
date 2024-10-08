    package Punto3;

    public class GPS {
        private Stack<Ruta> pilaRutas = new Stack<Ruta>();
        private Stack<Ruta> pilaDeshacer = new Stack<Ruta>();

        public void agregarRuta(Ruta ruta){
            pilaRutas.push(ruta);
        }

        public void deshacerRuta(){
            if(!pilaRutas.empty()){
                pilaDeshacer.push(pilaRutas.pop());
            }else{
                System.out.println("No hay rutas en el historial");
            }

        }

        public void rehacerRuta(){
            if(!pilaDeshacer.empty()){
                pilaRutas.push(pilaDeshacer.pop());
            }else{
                System.out.println("No hay rutas por rehacer");
            }
            
        }

        public void verRutaActual(){
            if (!pilaRutas.empty()) {
                System.out.println(pilaRutas.peek());                
            }else{
                System.out.println("No hay ninguna ruta para mostrar");
            }
        }

        public void verHistorialCompleto(){
            if(!pilaRutas.empty()){
                System.out.println(pilaRutas);
            }else{
                System.out.println("No hay nignuna ruta para mostrar");
            }
        }

        @Override
        public String toString() {
            return "GPS Rutas: \n" + pilaRutas;
        }

    }
