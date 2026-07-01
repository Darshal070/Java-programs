import java.awt.*;  
import javax.swing.*;  

class BorderLayoutDemo 
{  
    public static void main(String args[])
	{  
        JFrame f1 = new JFrame("BorderLayout Manager");  
        BorderLayout bl = new BorderLayout();  
        f1.setLayout(bl);  

        JButton b1 = new JButton("B1");  
        JButton b2 = new JButton("B2");  
        JButton b3 = new JButton("B3");  
        JButton b4 = new JButton("B4");  
        JButton b5 = new JButton("B5");  

        f1.add(b1, BorderLayout.NORTH);  
        f1.add(b2, BorderLayout.SOUTH);  
        f1.add(b3, BorderLayout.EAST);  
        f1.add(b4, BorderLayout.WEST);  
        f1.add(b5, BorderLayout.CENTER);  

        f1.setSize(500, 500);  
        f1.setVisible(true);  
    }  
}
