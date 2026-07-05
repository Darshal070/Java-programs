import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class LightningSimulator extends JPanel
        implements MouseListener {

    int mouseX = 500;
    int mouseY = 300;

    Random rand = new Random();

    public LightningSimulator() {

        setBackground(Color.BLACK);

        addMouseListener(this);

        Timer timer = new Timer(50, e -> repaint());

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

        // Background glow
        g2.setColor(new Color(10, 10, 30));
        g2.fillRect(0, 0, getWidth(), getHeight());

        // Draw lightning
        drawLightning(g2,
                getWidth() / 2,
                0,
                mouseX,
                mouseY,
                8);

        // Text
        g2.setColor(Color.WHITE);

        g2.setFont(new Font("Consolas", Font.BOLD, 24));

        g2.drawString("CLICK TO SUMMON LIGHTNING ⚡", 20, 40);
    }

    void drawLightning(Graphics2D g2,
                       int x1, int y1,
                       int x2, int y2,
                       int depth) {

        if (depth == 0) {

            g2.setColor(Color.CYAN);

            g2.setStroke(new BasicStroke(2));

            g2.drawLine(x1, y1, x2, y2);

            return;
        }

        int midX = (x1 + x2) / 2 + rand.nextInt(40) - 20;
        int midY = (y1 + y2) / 2 + rand.nextInt(40) - 20;

        drawLightning(g2, x1, y1, midX, midY, depth - 1);

        drawLightning(g2, midX, midY, x2, y2, depth - 1);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        mouseX = e.getX();
        mouseY = e.getY();

        repaint();
    }

    @Override public void mousePressed(MouseEvent e) {}
    @Override public void mouseReleased(MouseEvent e) {}
    @Override public void mouseEntered(MouseEvent e) {}
    @Override public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {

        JFrame frame = new JFrame("Lightning Storm");

        frame.add(new LightningSimulator());

        frame.setSize(1000, 700);

        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}