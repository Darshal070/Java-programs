import java.awt.*;
import javax.swing.*;

class JTableD 
{
    JTable t;
    JFrame f;

    JTableD() 
	{
        f = new JFrame("J Frame");

        String[] col = {"ID", "Name", "Sal"};

        Object[][] rows = 
		{
            {100, "darshal", 10.000},
            {200, "xyz", 20.000},
            {300, "bbc", 30.000}
        };

        t = new JTable(rows, col);
        t.setBounds(100, 100, 300, 300);

        JScrollPane jsp = new JScrollPane(t);
        f.add(jsp);

        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        new JTableD();
    }
}
