import java.awt.*;
import java.awt.event.*;
import java.util.Random;

class GuessGame extends Frame implements ActionListener
 {
    TextField input;
    Label message;
    Button guessBtn, resetBtn;
    int secretNumber;


    GuessGame() {
        setTitle("Number Guessing Game");
        setSize(400, 200);
        setLayout(new FlowLayout());

        message = new Label("Guess a number between 1 and 100:");
        input = new TextField(10);
        guessBtn = new Button("Guess");
        resetBtn = new Button("Reset");

        add(message);
        add(input);
        add(guessBtn);
        add(resetBtn);

        guessBtn.addActionListener(this);
        resetBtn.addActionListener(this);

        resetGame();

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
     {
        if (ae.getSource() == guessBtn) 
        {
            try {
                int guess = Integer.parseInt(input.getText());
                if (guess == secretNumber) 
                {
                    message.setText("🎉 Correct! The number was " + secretNumber);
                } else if (guess < secretNumber) 
                {
                    message.setText("Too low! Try again.");
                } else {
                    message.setText("Too high! Try again.");
                }
            } catch (NumberFormatException e)
             {
                message.setText("Please enter a valid number!");
            }
        } else if (ae.getSource() == resetBtn)
         {
            resetGame();
            message.setText("Game reset! Guess a number between 1 and 100:");
        }
    }

    private void resetGame() 
    {
        Random rand = new Random();
        secretNumber = rand.nextInt(100) + 1;
    }

    public static void main(String[] args) 
    {
        new GuessGame();
    }
}
