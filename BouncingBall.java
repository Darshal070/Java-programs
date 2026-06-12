import java.awt.*;
import java.awt.event.*;

class BouncingBall extends Frame implements Runnable {
    int x = 50, y = 50;      // Ball position
    int dx = 3, dy = 3;      // Ball speed
    int radius = 30;         // Ball size
    Thread t;

    BouncingBall() {
        setTitle("Bouncing Ball Animation");
        setSize(500, 400);
        setVisible(true);

        // Close window properly
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        // Start animation thread
        t = new Thread(this);
        t.start();
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x, y, radius, radius);
    }

    public void run() {
        while (true) {
            // Move ball
            x += dx;
            y += dy;

            // Bounce off walls
            if (x < 0 || x > getWidth() - radius) dx = -dx;
            if (y < 0 || y > getHeight() - radius) dy = -dy;

            // Repaint frame
            repaint();

            try {
                Thread.sleep(20); // control speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new BouncingBall();
    }
}
