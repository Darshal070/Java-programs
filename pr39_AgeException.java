import java.util.Scanner;

class pr39_AgeException extends Exception {
    pr39_AgeException(String msg) {
        super(msg);
    }
}

class AgeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new pr39_AgeException("Age must be 18 or above!");
            } else {
                System.out.println("Valid age: " + age);
            }
        } catch (pr39_AgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}