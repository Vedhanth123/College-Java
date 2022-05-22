
import java.awt.event.*;
import java.awt.*;

public class Eventhandlingpractice extends Frame implements ActionListener
{
    // creating a textfield
    TextField tf;
    public Eventhandlingpractice()
    {
        // creating a button
        tf = new TextField();
        Button bt = new Button();
        bt.addActionListener(this);

        add(bt);
        add(tf);

    }
    public void actionPerformed(ActionEvent a)
    {
        tf.setText("Hello");
    }
    public static void main(String[] args) {
        new Eventhandlingpractice();
    }
}

// create a class and implement ActionListener interface
// create an awt component
// add that to the frame
// add actionlistener function to the awt component by comp.addActionListener(this)
// define the actionPerformed funciton along with a parameter named ActionEvent e)
