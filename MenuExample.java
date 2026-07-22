import java.awt.*;
class MenuExample
{
public static void main(String args[])
{
	Frame f=new Frame("MenuBar,Menu and MenuItems");
	
	MenuBar MB = new MenuBar();
	
	Menu M1=new Menu("File");
	Menu M2=new Menu("Edit");
	
	MenuItem m1=new MenuItem("New");
	MenuItem m2=new MenuItem("Open");
	MenuItem m3=new MenuItem("Save");
	MenuItem m4=new MenuItem("Cut");
	MenuItem m5=new MenuItem("Copy");
	MenuItem m6=new MenuItem("Paste");
	
	M1.add(m1);
	M1.add(m2);
	M1.add(m3);
	
	M2.add(m4);
	M2.add(m5);
	M2.add(m6);
	
	Menu M3=new Menu("Save-as");
	
	MenuItem m7=new MenuItem(".jpg");
	MenuItem m8=new MenuItem(".png");
	MenuItem m9=new MenuItem(".pdf");
	
	M3.add(m7);
	M3.add(m8);
	M3.add(m9);
	
	M1.add(m3);
	
	MB.add(M1);
	MB.add(M2);
	
	f.setMenuBar(MB);
	
	f.setSize(400,400);
	f.setLayout(null);
	f.setVisible(true);
}
}
