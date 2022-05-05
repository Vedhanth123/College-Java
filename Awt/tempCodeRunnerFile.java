import java.io.*;

public class Bufferread {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader obj = new BufferedReader(isr);
        try
        {
            System.out.println("Write text you want to write");
            int number = obj.read();
            System.out.println(number * number);
        }
        catch(IOException e)
        {
            System.out.println("Cannot read");
        }
    }
    
}
