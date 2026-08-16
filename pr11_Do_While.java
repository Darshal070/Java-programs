import java.util.Scanner;
class pr11_Do_While{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i=1;
        do { 
            System.out.println(i);
            i++;
        } while (i<=5);

        //Palindrome  Number
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        int temp=n;
        int rev=0;

         while (n > 0) {
            int digit = n % 10;   
            rev = rev * 10 + digit; 
            n = n / 10;         
        }

        if (temp == rev) {
            System.out.println(temp + " is a Palindrome Number.");
        } else {
            System.out.println(temp + " is NOT a Palindrome Number.");
        }

        
    }
}