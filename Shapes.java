import java.awt.*;
import java.applet.*;
public class Shapes extends Applet
{
public void paint (Graphics g)
{
g.drawString("Concentric Circle", 120, 20);
g.setColor(Color.red);
g.drawOval(100, 100, 190, 190);
g.setColor(Color.blue);
g.drawOval(115, 115, 160, 160);
g.setColor(Color.green);
g.drawOval(130, 130, 130, 130);
}
}