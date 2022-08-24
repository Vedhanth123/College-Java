import java.lang.*;
import java.io.*;

public class Threadextendingthreadclass extends Thread
{
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Running the thread");
        }
    }    
    public static void main(String[] args) {
        Threadextendingthreadclass obj = new Threadextendingthreadclass();
        obj.start();
    }
}
