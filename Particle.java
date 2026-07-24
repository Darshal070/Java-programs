import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

class Particle {
    double x, y;
    double dx, dy;
    int size;
    Color color;

    public Particle(int x, int y) {
        this.x = x;
        this.y = y;

        Random rand = new Random();

        dx = rand.nextDouble() * 10 - 5;
        dy = rand.nextDouble() * 10 - 5;

        size = rand.nextInt(8) + 4;

        color = new Color(
                rand.nextInt(256),
                rand.nextInt(256),
                rand.nextInt(256)
        );
    }

    public void move() {
        x += dx;
        y += dy;

        dy += 0.1; // gravity
    }

    public void draw(Graphics2D g) {
        g.setColor(color);
        g.fillOval((int)x, (int)y, size, size);
    }
}

public class ExplosionSimulator extends JPanel
        implements ActionListener, MouseListener {

    ArrayList<Particle> particles = new ArrayList<>();
    Timer timer = new Timer(16, this);

    public ExplosionSimulator() {
        setBackground(Color.BLACK);
        addMouseListener(this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        for (Particle p : particles) {
            p.draw(g2);
        }

        g2.setColor(Color.WHITE);
        g2.setFont(new Font("Consolas", Font.BOLD, 24));
        g2.drawString("CLICK ANYWHERE 💥", 20, 40);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for (Particle p : particles) {
            p.move();
        }

        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        for (int i = 0; i < 100; i++) {
            particles.add(new Particle(e.getX(), e.getY()));
        }
    }

    @Override public void mousePressed(MouseEvent e) {}
    @Override public void mouseReleased(MouseEvent e) {}
    @Override public void mouseEntered(MouseEvent e) {}
    @Override public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {

        JFrame frame = new JFrame("Particle Explosion Simulator");

        ExplosionSimulator panel = new ExplosionSimulator();

        frame.add(panel);

        frame.setSize(1000, 700);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}