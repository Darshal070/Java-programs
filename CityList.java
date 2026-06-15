import java.awt.*;

public class CityList {
    public static void main(String[] args) {

        Frame f = new Frame("City List");
        f.setSize(300, 300);
        f.setLayout(null);

        List list = new List();
        list.setBounds(80, 60, 120, 150);

        list.add("New York");
        list.add("London");
        list.add("Tokyo");
        list.add("Paris");
        list.add("Mumbai");
        list.add("Sydney");
        list.add("Toronto");
        list.add("Dubai");
        list.add("Berlin");
        list.add("Singapore");

        f.add(list);

        f.setVisible(true);
    }
}