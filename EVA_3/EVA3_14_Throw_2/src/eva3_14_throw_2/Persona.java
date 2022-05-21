    package eva3_14_throw_2;

    public class Persona {
        private String nombre;
        private int edad;

        Persona(){
            nombre = "Gerardo Delgado";
            edad=18;
        }

        Persona(String nombre, int edad) throws Exception{
            this.nombre = nombre;
            setEdad(edad);
        }

        public int getEdad() {
            return edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setEdad(int edad) throws Exception {
            if(edad<=130 && edad>=0){
                this.edad = edad;
            }else{
                throw new Exception("Edad inválida");
            }
                
            
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }
