import java.awt.*;

class Demo 
{
    public static void main(String args[]) 
	{

        Frame fr = new Frame("Color Menu");

        MenuBar m = new MenuBar();
        Menu m1 = new Menu("Color");

        MenuItem M1 = new MenuItem("Red");
        MenuItem M2 = new MenuItem("Blue");
        MenuItem M3 = new MenuItem("Yellow");
        MenuItem M4 = new MenuItem("Black");

        m1.add(M1);
        m1.add(M2);
        m1.add(M3);
        m1.add(M4);

        m.add(m1);
        fr.setMenuBar(m);

        fr.setSize(500, 500);
        fr.setVisible(true);
    }
}