
import javax.swing.*;
import java.applet.*;
import java.awt.*;
public class CheckBoxExample extends Frame
{  
     CheckBoxExample(){  
        JCheckBox checkBox1 = new JCheckBox("C++");  
        checkBox1.setBounds(100,100, 50,50);  
        JCheckBox checkBox2 = new JCheckBox("Java", true);  
        checkBox2.setBounds(100,150, 50,50);  
        add(checkBox1);  
        add(checkBox2);  
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
     }  
public static void main(String args[])  
    {  
    new CheckBoxExample();  
    }}  