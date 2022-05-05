import java.lang.*;
import java.io.*;

public class App2 extends Thread
{
    public void run()
    {
        System.out.println("Running thread");
    }    
    public static void main(String[] args) {
        App2 obj = new App2();
        obj.start();
    }
}
