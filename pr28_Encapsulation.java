public class pr28_Encapsulation{
    private int id=101;
    int salary=50000;

    public int getid(){
        return id;
    }

    public void setid(int i){
        id=102;
    }
}
class Main{
    public static void main(String[] args) {
    pr28_Encapsulation e1= new pr28_Encapsulation();
    System.out.println(e1.getid());
    System.out.println(e1.salary);
    }
}