import java.util.Scanner;

public class pr38_Exception4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age=sc.nextInt();

        if(age<18){
            try{
                throw new ArithmeticException("Age is less than 18,so person is not eligible");
            }
            catch(ArithmeticException e){
                System.out.println("person not eligible to vote"+e);
            }
        }
        else{
            System.out.println("Person is eligible to voting");
        }
    }
} 