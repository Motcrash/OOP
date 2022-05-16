package eva3_11_throw;

public class EVA3_11_Throw {

    public static void main(String[] args) {
        try {
            throw new Exception("Mi excepción");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
