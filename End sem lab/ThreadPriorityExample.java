public class ThreadPriorityExample extends Thread {

  public void run() {
    // the print statement
    System.out.println("Inside the run() method");
  }

  public static void main(String argvs[]) {
    ThreadPriorityExample th1 = new ThreadPriorityExample();
    ThreadPriorityExample th2 = new ThreadPriorityExample();

    th1.setPriority(6);
    th2.setPriority(3);

    System.out.println(th1.getPriority());
    System.out.println(th2.getPriority());
  }
}
