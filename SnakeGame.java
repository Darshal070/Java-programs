import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class SnakeGame extends JPanel implements ActionListener
 {

    private final int TILE_SIZE = 25;
    private final int WIDTH = 600;
    private final int HEIGHT = 600;
    private final int TOTAL_TILES = (WIDTH * HEIGHT) / (TILE_SIZE * TILE_SIZE);

    private final int[] x = new int[TOTAL_TILES];
    private final int[] y = new int[TOTAL_TILES];

    private int bodyParts = 5;
    private int foodX;
    private int foodY;
    private int score = 0;

    private char direction = 'R';
    private boolean running = false;

    private Timer timer;
    private Random random;

    public SnakeGame()
     {

        random = new Random();

        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);

        this.addKeyListener(new MyKeyAdapter());

        startGame();
    }

    public void startGame()
     {

        newFood();

        running = true;

        timer = new Timer(100, this);
        timer.start();
    }

    public void paintComponent(Graphics g)
     {

        super.paintComponent(g);

        draw(g);
    }

    public void draw(Graphics g) 
    {

        if (running) {

            // Draw food
            g.setColor(Color.red);
            g.fillOval(foodX, foodY, TILE_SIZE, TILE_SIZE);

            // Draw snake
            for (int i = 0; i < bodyParts; i++) {

                if (i == 0) {
                    g.setColor(Color.green);
                } else {
                    g.setColor(new Color(45, 180, 0));
                }

                g.fillRect(x[i], y[i], TILE_SIZE, TILE_SIZE);
            }

            // Score
            g.setColor(Color.white);
            g.setFont(new Font("Arial", Font.BOLD, 24));

            g.drawString("Score: " + score, 20, 30);

        } else {

            gameOver(g);
        }
    }

    public void move() 
    {

        for (int i = bodyParts; i > 0; i--) {

            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }

        switch (direction)
         {

            case 'U':
                y[0] -= TILE_SIZE;
                break;

            case 'D':
                y[0] += TILE_SIZE;
                break;

            case 'L':
                x[0] -= TILE_SIZE;
                break;

            case 'R':
                x[0] += TILE_SIZE;
                break;
        }
    }

    public void newFood()
     {

        foodX = random.nextInt(WIDTH / TILE_SIZE) * TILE_SIZE;
        foodY = random.nextInt(HEIGHT / TILE_SIZE) * TILE_SIZE;
    }

    public void checkFood()
     {

        if (x[0] == foodX && y[0] == foodY) 
        {

            bodyParts++;
            score++;

            newFood();
        }
    }

    public void checkCollisions()
     {

        // Snake hits itself
        for (int i = bodyParts; i > 0; i--)
         {

            if (x[0] == x[i] && y[0] == y[i]) {

                running = false;
            }
        }

        // Wall collisions
        if (x[0] < 0 || x[0] >= WIDTH ||
            y[0] < 0 || y[0] >= HEIGHT) 
            {

            running = false;
        }

        if (!running) {

            timer.stop();
        }
    }

    public void gameOver(Graphics g)
     {

        g.setColor(Color.red);

        g.setFont(new Font("Arial", Font.BOLD, 40));

        FontMetrics metrics = getFontMetrics(g.getFont());

        g.drawString("Game Over",
                (WIDTH - metrics.stringWidth("Game Over")) / 2,
                HEIGHT / 2);

        g.setFont(new Font("Arial", Font.BOLD, 25));

        g.drawString("Final Score: " + score,
                WIDTH / 2 - 90,
                HEIGHT / 2 + 50);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (running) {

            move();

            checkFood();

            checkCollisions();
        }

        repaint();
    }

    public class MyKeyAdapter extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {

            switch (e.getKeyCode()) {

                case KeyEvent.VK_LEFT:
                    if (direction != 'R') {
                        direction = 'L';
                    }
                    break;

                case KeyEvent.VK_RIGHT:
                    if (direction != 'L') {
                        direction = 'R';
                    }
                    break;

                case KeyEvent.VK_UP:
                    if (direction != 'D') {
                        direction = 'U';
                    }
                    break;

                case KeyEvent.VK_DOWN:
                    if (direction != 'U') {
                        direction = 'D';
                    }
                    break;
            }
        }
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Snake Game");

        SnakeGame gamePanel = new SnakeGame();

        frame.add(gamePanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();

        frame.setLocationRelativeTo(null);

        frame.setResizable(false);

        frame.setVisible(true);
    }
}