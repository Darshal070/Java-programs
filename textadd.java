import javax.swing.*;
import java.awt.event.*;

public class textadd 
{
    public static void main(String[] args) 
	{

        JFrame f = new JFrame("Addition");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();
        JButton b = new JButton("Add");

        t1.setBounds(50,30,100,30);
        t2.setBounds(50,70,100,30);
        t3.setBounds(50,110,100,30);
        b.setBounds(170,70,80,30);

        b.addActionListener(new ActionListener()
		{
            public void actionPerformed(ActionEvent e)
			{
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a + b;
                t3.setText(String.valueOf(c));
            }
        });

        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(b);

        f.setSize(300,200);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}