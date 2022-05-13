import java.lang.*;
import java.io.*;

public class Exceptionhandling 
{
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try
        {
            System.out.println(a/b);
        }
        catch (ArithmeticException ae)
        {
            System.out.println(ae.getMessage());
        }
        finally
        {
            System.out.println("End of Exception");
        }
    }       
}
