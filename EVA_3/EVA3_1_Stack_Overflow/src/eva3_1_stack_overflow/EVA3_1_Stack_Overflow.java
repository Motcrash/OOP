package eva3_1_stack_overflow;

public class EVA3_1_Stack_Overflow {

    public static void main(String[] args) {
        int c = 0;
        terminarStack(c);
    }
    
    public static void terminarStack(int c){
        c++;
        System.out.println(c);
        terminarStack(c);   
    }
    
}
