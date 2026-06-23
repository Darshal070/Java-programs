import java.awt.*;
class Example
{
	public static void main(String args[])
	{
		Frame F= new Frame("Example");
		F.setSize(500,500);
		F.setVisible(true);
		F.setLayout(null);
		TextArea t1=new TextArea("Text Example");
		t1.setBounds(100,100,50,50);
		F.add(t1);
	}
}