import java.io.*;

public class Bufferread {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader obj = new BufferedReader(isr);
        try
        {
            System.out.println("Write text you want to write");
            String n = obj.readLine();
            System.out.println(n);
        }
        catch(IOException e)
        {
            System.out.println("Cannot read");
        }
    }
    
}