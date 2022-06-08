package proyecto;

class CalificacionExcepcion extends Exception{
    
    public  CalificacionExcepcion() {
    }

    public CalificacionExcepcion(String message) {
        super(message);
    }
}