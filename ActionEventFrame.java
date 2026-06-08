import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ActionEventFrame extends JFrame implements ActionListener
{
    JButton b1 = new JButton("Yes");
    JButton b2 = new JButton("No");
    JLabel l1 = new JLabel("");

    ActionEventFrame()
    {
        setLayout(new FlowLayout());

        b1.addActionListener(this);
        b2.addActionListener(this);

        add(l1);
        add(b1);
        add(b2);

        setSize(500,500);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            l1.setText("Yes Button is Pressed");
        }

        if(ae.getSource()==b2)
        {
            l1.setText("No Button is Pressed");
        }
    }

    public static void main(String args[])
    {
        new ActionEventFrame();
    }
}