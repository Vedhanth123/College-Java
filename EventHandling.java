import java.awt.*;
import java.awt.event.*;

class EventHandle extends Frame implements ActionListener
{

    // creating a global variable so that everyone can access it
    TextField tf;
    EventHandle()
    {
        TextField tf = new TextField(); //Component Creation
        Button button = new Button("Quote"); // ComponentCreation
        try
        {
            tf.setBounds(60, 50, 170, 20);
        }
        catch (Exception e)
        {
            button.setBounds(90, 140, 75, 40);
            //setBounds method is used to provide position and size of the component
            button.addActionListener(this); //registering component with listener
            add(button);
            add(tf);
            setSize(250, 250);
            setLayout(null);
            setVisible(true);

            System.out.println("Added buttons and text");
        }
        // this refers to current instance

        // add Components
    }


  //implementing method of actionListener
    public void actionPerformed(ActionEvent e)
    {
        try
        {
            tf.setText("Keep Learning");
        }
        catch (Exception f)
        {
            System.out.println("Unable to change the text");
        }
    }

    public static void main(String args[])
    {
        new EventHandle();
    }
}
