
public class Main
{

    public static void main(String[] args) {
        
        System.out.println("\n");
        
        try {
            
            System.out.println("\n");
            
            float x = 100 % 7;
            
            System.out.println(x);
        }
        
        
        catch (ArithmeticException e) {
            
            System.out.println("Hit em' Arithmetic Exception.");
        }
        
        catch (Exception e) {
            
            System.out.println("Tis the main Exception.");
        }
        
        finally {
            
            System.out.println("Here is the Finally method.");
        }
    }
}
