import java.lang.*;
import java.io.*;

// creating a class which implements runnable interface
class Mythread implements Runnable
{
    public void run()
    {
        System.out.println("Thread running");
    }
}

public class App1
{
    public static void main(String[] args) {

        // creating an object of mythread class
        Mythread obj = new Mythread();

        // creating a Thread class object and inserting mythread class object to Thread class constructor
        Thread th1 = new Thread(obj,"First Thread");

        th1.start();
        System.out.println(th1.getName());
    }
}