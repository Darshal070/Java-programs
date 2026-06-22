import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventHandlingDemo extends JFrame implements KeyListener, MouseListener 
{

    JLabel label;

    EventHandlingDemo()
	{
        label = new JLabel("Press any key or click the mouse", JLabel.CENTER);
        add(label);

        addKeyListener(this);
        addMouseListener(this);

        setTitle("Key and Mouse Event");
        setSize(500,500);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e)
	{
        label.setText("Key Pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e)
	{
        label.setText("Key Released: " + e.getKeyChar());
    }

    public void keyTyped(KeyEvent e) 
	{
        label.setText("Key Typed: " + e.getKeyChar());
    }

  
  public void mouseClicked(MouseEvent e) 
	{
        label.setText("Mouse Clicked at (" + e.getX() + "," + e.getY() + ")");
    }

    public void mousePressed(MouseEvent e)
	{
        label.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) 
	{
        label.setText("Mouse Released");
    }

    public void mouseEntered(MouseEvent e)
	{
        label.setText("Mouse Entered Window");
    }

    public void mouseExited(MouseEvent e)
	{
        label.setText("Mouse Exited Window");
    }

    public static void main(String[] args)
	{
        new EventHandlingDemo();
    }
}