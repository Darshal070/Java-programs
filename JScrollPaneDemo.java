import java.awt.*;
import javax.swing.*;
class JScrollPaneDemo
{
	public static void main(String args[])
	{
		JFrame frame = new JFrame("Scroll pane Example");
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(200,200));
		int b=0;
		
		for(int i=0;i<200;i++)
		{
			for(int j=0;j<200;j++)
			{
				jp.add(new JButton("Button"+b));
				++b;
			}
		}
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		JScrollPane jsp = new JScrollPane(jp,v,h);
		frame.add(jsp,BorderLayout.CENTER);
		frame.setSize(500,500);
		frame.setVisible(true);
	}
}