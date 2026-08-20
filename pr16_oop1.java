public class pr16_oop1{
    String color="white" ;
    String model="creta";
    void getdata(){
        System.out.println("car is started");
    }
    void putdata(){
        System.out.println("car is stopped");
        System.out.println("color of car :"+color);
        System.out.println("Model of car is :"+model);
    }
    public static void main(String[] args) {
        pr16_oop1 c= new pr16_oop1();
        c.getdata();
        c.putdata();
    }
}