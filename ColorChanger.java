import java.awt.*;
import java.awt.event.*;

class ColorChanger extends Frame implements ActionListener {
    Button redBtn, greenBtn, blueBtn;

    ColorChanger() {
        // Create buttons
        redBtn = new Button("Red");
        greenBtn = new Button("Green");
        blueBtn = new Button("Blue");

        // Set layout
        setLayout(new FlowLayout());

        // Add buttons to frame
        add(redBtn);
        add(greenBtn);
        add(blueBtn);

        // Register event listeners
        redBtn.addActionListener(this);
        greenBtn.addActionListener(this);
        blueBtn.addActionListener(this);

        // Frame settings
        setSize(400, 300);
        setTitle("Color Changer - AWT Event Demo");
        setVisible(true);

        // Close window properly
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // Handle button clicks
    public void actionPerformed(ActionEvent ae) {
        String cmd = ae.getActionCommand();
        if (cmd.equals("Red")) {
            setBackground(Color.RED);
        } else if (cmd.equals("Green")) {
            setBackground(Color.GREEN);
        } else if (cmd.equals("Blue")) {
            setBackground(Color.BLUE);
        }
    }

    public static void main(String[] args) {
        new ColorChanger();
    }
}
