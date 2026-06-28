import java.awt.*;
import javax.swing.*;

public class HyperspaceTunnel extends JPanel {

    double angle = 0;

    public HyperspaceTunnel() {

        setBackground(Color.BLACK);

        Timer timer = new Timer(16, e -> {
            angle += 0.03;
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

        int w = getWidth();
        int h = getHeight();

        int cx = w / 2;
        int cy = h / 2;

        for (int i = 0; i < 120; i++) {

            double t = i * 0.15 + angle;

            int radius = (int) (i * 6);

            int x = cx + (int) (Math.cos(t) * radius);
            int y = cy + (int) (Math.sin(t) * radius);

            int size = 10 + i / 2;

            int r = (int)(128 + 127 * Math.sin(t));
            int gr = (int)(128 + 127 * Math.sin(t + 2));
            int b = (int)(128 + 127 * Math.sin(t + 4));

            g2.setColor(new Color(r % 255, gr % 255, b % 255));

            g2.drawOval(x, y, size, size);
        }

        g2.setColor(Color.WHITE);

        g2.setFont(new Font("Consolas", Font.BOLD, 20));

        g2.drawString("HYPERSPACE MODE ACTIVE 🚀", 20, 30);
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Hyperspace Tunnel");

        frame.add(new HyperspaceTunnel());

        frame.setSize(1000, 700);

        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}