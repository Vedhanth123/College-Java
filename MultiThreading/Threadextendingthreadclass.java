import java.lang.*;
import java.io.*;

public class Threadextendingthreadclass extends Thread
{
    public void run()
    {
        System.out.println("Running thread");
    }    
    public static void main(String[] args) {
        Threadextendingthreadclass obj = new Threadextendingthreadclass();
        obj.start();
    }
}
