import java.awt.*;
class TextandButton 
{
    public static void main(String args[])
	{

        Frame f = new Frame("Simple form");
      
        Label l1 = new Label("form");
        l1.setBounds(100,100,50,50);

        TextField t1 = new TextField();
        t1.setBounds(100,200,50,50);

        Button b = new Button("Eg");
        b.setBounds(100,300,50,50);

        f.add(l1);
        f.add(t1);
        f.add(b);
		
		f.setSize(500,500);
		f.setVisible(true);
		f.setSize(500,500);
    }
}