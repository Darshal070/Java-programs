import javax.swing.*;
class Sample
{
	public static void main(String args[])
	{
		JFrame JF=new JFrame();
		String country[]={"India","japan","china","USA","pakistan"};
		JComboBox JB=new JComboBox(country);
		JB.setBounds(100,100,50,50);
		JF.add(JB);
		JF.setVisible(true);
		JF.setSize(500,500);
	}
}