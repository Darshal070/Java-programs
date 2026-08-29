public interface pr27_interface{
    void car_color();
    void car_name();
}
class car implements pr27_interface{
    public void car_color(){
        System.out.println("White");
    }
    
    public void car_name(){
        System.out.println("Scorpio");
    }   
    public static void main(String[] args) {
        car c1=new car();
        
        c1.car_color();
        c1.car_name();
    }
 }