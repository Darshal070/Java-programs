import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Clculator extends JFrame implements ActionListener {
    JTextField textField;
    double num1, num2, result;
    char operator;

    public Clculator() {
        textField = new JTextField();
        textField.setBounds(30, 40, 280, 30);
        add(textField);

        String[] buttons = {
            "7","8","9","/","4","5","6","*",
            "1","2","3","-","0",".","=","+"
        };

        int x = 30, y = 100;
        for (int i = 0; i < buttons.length; i++) {
            JButton b = new JButton(buttons[i]);
            b.setBounds(x, y, 60, 40);
            add(b);
            b.addActionListener(this);
            x += 70;
            if ((i+1) % 4 == 0) {
                x = 30;
                y += 50;
            }
        }

        setLayout(null);
        setSize(350, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if ((command.charAt(0) >= '0' && command.charAt(0) <= '9') || command.equals(".")) {
            textField.setText(textField.getText() + command);
        } else if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/")) {
            num1 = Double.parseDouble(textField.getText());
            operator = command.charAt(0);
            textField.setText("");
        } else if (command.equals("=")) {
            num2 = Double.parseDouble(textField.getText());
            switch (operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = num1 / num2; break;
            }
            textField.setText("" + result);
        }
    }

    public static void main(String[] args) {
        new Clculator();
    }
}
