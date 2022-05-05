package awt;
import java.awt.*;
import java.applet.*;

public class FirstAwt extends Frame
{
    Button b;
    FirstAwt()
    {
        b = new Button();
        b.setLabel("Button");
        b.setSize(20,30);
        b.setVisible(true);
        setSize(400,500);
        setVisible(true);
        add(b);
    }
    public static void main(String[] args) {
        FirstAwt obj = new FirstAwt();
    }
}package College-Java.Awt;

public class FirstAwt {
    
}
