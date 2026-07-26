import javax.swing.*;

class ProgressDemo
 {
    JFrame f;
    JProgressBar pb;

    ProgressDemo() 
	{
        f = new JFrame("Progress Bar Example");
        pb = new JProgressBar(0, 100);
        pb.setBounds(50, 50, 300, 30);
        pb.setValue(0);
        pb.setStringPainted(true);

        f.add(pb);
        f.setSize(400, 200);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int i = 0;
        while (i <= 100) 
		{
            pb.setValue(i);
            try {
                Thread.sleep(5000);
            }
			catch (Exception e) {}
            i += 5;
        }
    }

    public static void main(String[] args) {
        new ProgressDemo();
    }
}
