import java.awt.*;
import java.awt.event.*;

class RailwayAWT extends Frame implements ActionListener {

    Label l1, l2, l3, l4, l5;
    TextField t1, t2;
    Choice trainChoice, genderChoice;
    Button bookBtn, clearBtn;
    TextArea output;

    RailwayAWT() {
        setTitle("Railway Reservation System");

        l1 = new Label("Passenger Name:");
        l2 = new Label("Age:");
        l3 = new Label("Gender:");
        l4 = new Label("Train:");
        l5 = new Label("Reservation Details:");

        t1 = new TextField();
        t2 = new TextField();

        trainChoice = new Choice();
        trainChoice.add("Express A");
        trainChoice.add("Express B");
        trainChoice.add("Express C");

        genderChoice = new Choice();
        genderChoice.add("Male");
        genderChoice.add("Female");
        genderChoice.add("Other");

        bookBtn = new Button("Book Ticket");
        clearBtn = new Button("Clear");

        output = new TextArea();

        setLayout(null);

        l1.setBounds(50, 50, 120, 30);
        t1.setBounds(180, 50, 150, 30);

        l2.setBounds(50, 100, 120, 30);
        t2.setBounds(180, 100, 150, 30);

        l3.setBounds(50, 150, 120, 30);
        genderChoice.setBounds(180, 150, 150, 30);

        l4.setBounds(50, 200, 120, 30);
        trainChoice.setBounds(180, 200, 150, 30);

        bookBtn.setBounds(50, 250, 120, 30);
        clearBtn.setBounds(200, 250, 120, 30);

        l5.setBounds(50, 300, 200, 30);
        output.setBounds(50, 330, 300, 150);

        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(genderChoice);
        add(l4); add(trainChoice);
        add(bookBtn); add(clearBtn);
        add(l5); add(output);

        bookBtn.addActionListener(this);
        clearBtn.addActionListener(this);

        setSize(400, 550);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bookBtn) {
            String name = t1.getText();
            String age = t2.getText();
            String gender = genderChoice.getSelectedItem();
            String train = trainChoice.getSelectedItem();

            if (name.isEmpty() || age.isEmpty()) {
                output.setText("Please fill all details!");
                return;
            }

            int pnr = (int)(Math.random() * 10000);

            output.setText("---- Ticket Booked ----\n");
            output.append("PNR: " + pnr + "\n");
            output.append("Name: " + name + "\n");
            output.append("Age: " + age + "\n");
            output.append("Gender: " + gender + "\n");
            output.append("Train: " + train + "\n");
        }

        if (e.getSource() == clearBtn) {
            t1.setText("");
            t2.setText("");
            output.setText("");
        }
    }

    public static void main(String[] args) {
        new RailwayAWT();
    }
}