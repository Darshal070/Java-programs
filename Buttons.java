import java.awt.*;
 class Buttons
 {
    public static void main(String args[])
	{

        Frame f1 = new Frame("Three Button");
 
        Button b1 = new Button("OK");
        b1.setBounds(100,100,50,50);

        Button b2 = new Button("RESET");
		b2.setBounds(100,200,50,50);
		
        Button b3 = new Button("CANCEL");
        b3.setBounds(100,300,50,50);

        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
		
		f1.setSize(500,500);
        f1.setVisible(true);
		f1.setLayout(null);
    }
}