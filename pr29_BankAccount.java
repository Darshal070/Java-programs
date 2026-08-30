public class pr29_BankAccount{
    private int AccNo=246123;
    private int Balance=50000;

    public int getno(){
        return AccNo;
    }

    public int getbalance(){
        return Balance;
    }

    public void setno(int n){
        AccNo=n;
    }

    public void setba(int b){
        Balance=b;
    }
}
class Main{
    public static void main(String[] args) {
    pr29_BankAccount b1= new pr29_BankAccount();
    b1.setno(246124);
    b1.setba(60000);
    System.out.println(b1.getno());
    System.out.println(b1.getbalance());
    }
}