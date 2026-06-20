import java.awt.*;
import java.awt.event.*;

class DrawingPad extends Frame {
    int x, y;   

    DrawingPad() {
        setTitle("AWT Drawing Pad");
        setSize(600, 400);
        setVisible(true);

     
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent me) {
                x = me.getX();
                y = me.getY();
                Graphics g = getGraphics();
                g.setColor(Color.BLUE);
                g.fillOval(x, y, 5, 5); // draw small circle
            }
        });
    }

    public static void main(String[] args) {
        new DrawingPad();
    }
}
