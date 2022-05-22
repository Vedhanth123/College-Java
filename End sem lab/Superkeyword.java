class Main
{
    // Super keyword is used to access immeditate parent class's methods, data members and contructors
    public void function()
    {
        System.out.println("Main class function");
    }
}

public class Superkeyword extends Main
{
    void procudure()
    {
        super.function();   
    }
    public static void main(String[] args) {
        Superkeyword obj = new Superkeyword();
        obj.procudure();
    }
}