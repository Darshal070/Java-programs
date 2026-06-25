import java.awt.*;  
import javax.swing.*;  
class GridLayoutDemo extends JFrame
 {  
    GridLayoutDemo()
	{  
        setLayout(new GridLayout(3, 2, 3, 3));  

        JButton B1 = new JButton("one");  
        JButton B2 = new JButton("two");  
        JButton B3 = new JButton("three");  
        JButton B4 = new JButton("four");  
        JButton B5 = new JButton("five");  

        add(B1);  
        add(B2);  
        add(B3);  
        add(B4);  
        add(B5);  

        setTitle("GridLayout Example");  
        setSize(500, 500);  
        setVisible(true);  
    }  

    public static void main(String args[])
	{  
        new GridLayoutDemo();  
    }  
}
