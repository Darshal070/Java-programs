
import java.util.Scanner;

class pr10_While_Loop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        //Even No & Odd No.1-50
        int j = 1;
        while (j <= 50) {
            if (j % 2 == 0) {
                System.out.println("Even no is = " + j);
            } else {
                System.out.println("Odd no is = " + j);
            }
            j++;
        }

        //Reverse No. Print
        int k = 10;
        while (k >= 1) {
            System.out.println(k);
            k--;
        }

        //REVERSE NUMBER
        System.out.println("Enter the no. to be reverse");
        int n1 = sc.nextInt();
        int rev = 0;

        while (n1 > 0) {
            int lastdigit = n1 % 10;
            rev = rev * 10 + lastdigit;
            n1 = n1 / 10;
        }
        System.out.println(rev);

        //Factorial of Number
        int fact = 1;
        int f = 1;
        while (f <= 5) {
            fact = fact * f;
            System.out.println(fact);
            f++;
        }

        //Pattern of * printing
        int p = 1;
        while (p <= 4) {
            int a = 1;
            while (a <= p) {
                System.out.print(" * ");
                a++;
            }
            System.out.println();
            p++;
        }

    }
}