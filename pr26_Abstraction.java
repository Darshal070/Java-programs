abstract class pr26_Abstraction{
    //abstract method
    abstract void car_name();
    //non-abstract method
    public void car_color(){
        System.out.println("Black");
    }
}
class info extends pr26_Abstraction{
    void car_name(){
        System.out.println("Creata");
    }

    public static void main(String[] args) {
        info i1=new info();
        i1.car_name();
        i1.car_color();
    }
}