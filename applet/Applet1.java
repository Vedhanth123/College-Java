import java.awt.*;
import java.applet.*;

// creating a class and extending it with Applet class
public class Applet1 extends Applet
{
    // paint method is used to draw something on screen
    public void paint(Graphics g)
    {
        g.drawString("String to be printed", 100, 100);
    }
}