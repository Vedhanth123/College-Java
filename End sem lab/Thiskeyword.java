public class Thiskeyword {

    // This keyword points to the current object
    int a;
    int b;
    Thiskeyword(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        Thiskeyword obj = new Thiskeyword(1, 2);
    }
    
}
