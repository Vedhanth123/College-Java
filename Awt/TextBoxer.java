
import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;

import java.awt.event.*;


public class TextBoxer extends Frame implements ActionListener
{
    TextField tf;
    TextBoxer()
    {
        // creating a button
        Button b = new Button("Click Me!");
        tf = new TextField();
        add(b);
        add(tf);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        tf.setText("Button Clicked!");
    }
    public static void main(String[] args) {
        TextBoxer obj = new TextBoxer();
    }

}