package My;

import java.applet.*;
import java.awt.*;


// Java program to run the applet 
// using the web browser
public class GfgApplet extends Applet
{
    String msg="";
    public void init()
    {
        msg="Hello Geeks";
    }

    public void start()
    {
        msg=msg+",Welcome to GeeksForGeeks";
    }

    public void paint(Graphics g)
    {
        g.drawString(msg,20,20);
    }
    public static void main(String[] args) 
    {
        GfgApplet obj = new GfgApplet();
    }
}