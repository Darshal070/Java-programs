import java.awt.*;
import javax.swing.*;

class ProBarCLG extends JFrame {
    JProgressBar JB;   

    ProBarCLG() {
        JB = new JProgressBar(0, 100);
        JB.setBounds(100, 100, 200, 30);
        JB.setValue(0);
        JB.setStringPainted(true);
        add(JB);

        setLayout(null);
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void iterate() {
        int i = 0;
        while (i <= 100) {
            JB.setValue(i);
            i += 20;

            try {
                Thread.sleep(150);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String args[]) {
        ProBarCLG PBC = new ProBarCLG();
        PBC.iterate();
    }
}
