import javax.swing.*;
import javax.swing.event.*;

public class TextEvent 
{
    public static void main(String[] args)
	{

        JFrame f = new JFrame("Text Event");
        JTextField t = new JTextField(20);

        t.getDocument().addDocumentListener(new DocumentListener()
		{
            public void insertUpdate(DocumentEvent e)
			{
                System.out.println(t.getText());
            }

            public void removeUpdate(DocumentEvent e)
			{
                System.out.println(t.getText());
            }

            public void changedUpdate(DocumentEvent e) 
			{
                System.out.println(t.getText());
            }
        });

        f.add(t);
        f.setSize(500,500);
        f.setVisible(true);
    }
}