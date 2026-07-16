import java.util.Scanner;
class controlstmt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Program 1: Even/Odd
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }

        // Program 2: Voting Eligibility
        System.out.println("Enter the age");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Person Eligible for voting");
        } else {
            System.out.println("Person is Not Eligible for voting");
        }

        //Enter the age for checking for donate the blood
        System.out.println("Enter the age for checking for donate the blood");
        int bloodAge = sc.nextInt();
        System.out.println("Enter the weight");
        int weight = sc.nextInt();
        if (bloodAge >= 18){  
            if (weight >= 50) {   
        
            System.out.println("Person is Eligible for donating blood");
        }
        } else{   
            System.out.println("Person is Not Eligible for donating blood");
        }
       
    }
}