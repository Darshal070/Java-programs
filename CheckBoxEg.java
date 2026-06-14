import java.awt.*;
class CheckBoxEg extends Frame
{
	Checkbox c1,c2,c3,c4,c5;
	CheckBoxEg()
	{
		setLayout(null);
		setVisible(true);
		setSize(500,500);
		setTitle("CHECKBOX EXAMPLE");
		c1=new Checkbox("Java",true);
		c2=new Checkbox("C++",false);
		c3=new Checkbox("Python",false);
		c4=new Checkbox("MIC",false);
		c5=new Checkbox("DCN",false);
		
		c1.setBounds(100,100,50,50);
		c2.setBounds(100,200,50,50);
		c1.setBounds(100,100,50,50);
		c2.setBounds(100,200,50,50);
		c3.setBounds(100,300,50,50);
		c4.setBounds(100,400,50,50);
		c5.setBounds(100,500,50,50);
		
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(c5);
		
	}
	public static void main(String args[])
	{
		CheckBoxEg cb=new CheckBoxEg();
	}
}