package eva3_16_custom_exeptions;

public class ExcepcionDeCaptura extends Exception{
    ExcepcionDeCaptura(){
        
    }
    
    ExcepcionDeCaptura(String mensaje){
        super(mensaje);
    }
}
