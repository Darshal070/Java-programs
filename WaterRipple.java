import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

class Ripple {
    int x, y;
    int radius = 0;
    int alpha = 255;

    Ripple(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void update() {
        radius += 3;
        alpha -= 4;

        if (alpha < 0)
            alpha = 0;
    }

    void draw(Graphics2D g2) {

        g2.setColor(new Color(0, 200, 255, alpha));

        g2.setStroke(new BasicStroke(3));

        g2.drawOval(
                x - radius,
                y - radius,
                radius * 2,
                radius * 2
        );
    }

    boolean isDead() {
        return alpha <= 0;
    }
}

public class WaterRipple extends JPanel
        implements MouseListener {

    ArrayList<Ripple> ripples = new ArrayList<>();

    public WaterRipple() {

        setBackground(Color.BLACK);

        addMouseListener(this);

        Timer timer = new Timer(16, e -> {

            for (int i = 0; i < ripples.size(); i++) {

                ripples.get(i).update();

                if (ripples.get(i).isDead()) {
                    ripples.remove(i);
                    i--;
                }
            }

            repaint();
        });

        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );

        // Draw all ripples
        for (Ripple r : ripples) {
            r.draw(g2);
        }

        // Title
        g2.setColor(Color.WHITE);

        g2.setFont(new Font("Consolas", Font.BOLD, 24));

        g2.drawString("CLICK FOR WATER WAVES 💧", 20, 40);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        ripples.add(new Ripple(e.getX(), e.getY()));
    }

    @Override public void mousePressed(MouseEvent e) {}
    @Override public void mouseReleased(MouseEvent e) {}
    @Override public void mouseEntered(MouseEvent e) {}
    @Override public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {

        JFrame frame = new JFrame("Water Ripple Simulator");

        frame.add(new WaterRipple());

        frame.setSize(1000, 700);

        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}