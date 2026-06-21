import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventDemo extends JFrame implements KeyListener, MouseListener, MouseMotionListener
 {

    private JTextArea textArea;

    public EventDemo() 
	{
        setTitle("Key and Mouse Event Demo");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        textArea.setEditable(false);
        add(new JScrollPane(textArea));

        addKeyListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);

        setVisible(true);
    }

    public void keyPressed(KeyEvent e) 
	{
        textArea.append("Key Pressed: " + e.getKeyChar() + "\n");
    }

    public void keyReleased(KeyEvent e)
	{
        textArea.append("Key Released: " + e.getKeyChar() + "\n");
    }

    public void keyTyped(KeyEvent e) 
	{
        textArea.append("Key Typed: " + e.getKeyChar() + "\n");
    }

    public void mouseClicked(MouseEvent e)
	{
        textArea.append("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")\n");
    }

    public void mousePressed(MouseEvent e) 
	{
        textArea.append("Mouse Pressed\n");
    }

    public void mouseReleased(MouseEvent e) 
	{
        textArea.append("Mouse Released\n");
    }

    public void mouseEntered(MouseEvent e)
	{
        textArea.append("Mouse Entered Component\n");
    }

    public void mouseExited(MouseEvent e) 
	{
        textArea.append("Mouse Exited Component\n");
    }

    public void mouseDragged(MouseEvent e)
	{
        textArea.append("Mouse Dragged at (" + e.getX() + ", " + e.getY() + ")\n");
    }

    public void mouseMoved(MouseEvent e) 
	{
        textArea.append("Mouse Moved at (" + e.getX() + ", " + e.getY() + ")\n");
    }

    public static void main(String[] args) 
	{
        new EventDemo();
    }
}
