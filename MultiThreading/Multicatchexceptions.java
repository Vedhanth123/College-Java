import java.lang.*;
import java.lang.reflect.Array;


public class Multicatchexceptions {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        int divisor = 0;

        try
        {
            for(int i = 0; i < 7; i ++)
            {
                System.out.println(array[i]/divisor);
            }
        }
        catch(ArrayIndexOutOfBoundsException are)
        {
            System.out.println(are.getMessage());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
