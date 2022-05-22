interface A
{
    void Father();
}
interface B
{
    void Mother();
}

public class Multipleinheirtance implements A,B
{
    @Override
    public void Father() {
        System.out.println("I am your father");
    }
    @Override
    public void Mother() {
        System.out.println("I am your mother");
    }
    public static void main(String args[])
    {
        Multicatchexceptions obj = new Multicatchexceptions();
        obj.Father();
        obj.Mother();
    }

}
