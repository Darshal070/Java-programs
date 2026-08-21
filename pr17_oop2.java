public class pr17_oop2{
    String name="dog" ;
    String color="white";
    float height=100;
    void run(){
        System.out.println("animal is running");
    }
    void eat(){
        System.out.println("animal is eating");
        System.out.println("name of animal :"+name);
        System.out.println("color of animal :"+color);
        System.out.println("height of animal is :"+height);
    }
    public static void main(String[] args) {
        pr17_oop2 cat= new pr17_oop2();
        pr17_oop2 dog= new pr17_oop2();
        cat.run();
        cat.eat();
        dog.run();
        dog.eat();
    }
}