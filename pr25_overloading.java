class Shape {

    void area(int length, int width) {
        System.out.println("Area of Rectangle = " + (length * width));
    }

    void area(int radius) {
        double circleArea = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + circleArea);
    }
}

public class pr25_overloading {
    public static void main(String[] args) {

        Shape s = new Shape();

        s.area(10, 20);  
        s.area(7);       
    }
}