import java.awt.*;
class BorderLayoutDemo
{
	public static void main(String args[])
	{
		Frame f1 =new Frame("BorderLayout Manager");
		BorderLayout bl =new BorderLayout();
		f1.setLayout(bl);
		
		Button b1=new Button("B1");
		Button b2=new Button("B2");
		Button b3=new Button("B3");
		Button b4=new Button("B4");
		Button b5=new Button("B5");
		
		f1.add(b1,BorderLayout.NORTH);
		f1.add(b2,BorderLayout.SOUTH);
		f1.add(b3,BorderLayout.EAST);
		f1.add(b4,BorderLayout.WEST);
		f1.add(b5,BorderLayout.CENTER);
		
		f1.setVisible(true);
		f1.setSize(500,500);
	}
}