import java.util.Scanner;
class pr15_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Method 1: Fixed array
        int[] marks = {85, 80, 75, 90, 87};
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // Method 2: User input 
        System.out.println("Enter the No. of Students:");
        int n = sc.nextInt();
        int[] mark1 = new int[n];

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks of student " + i);
            mark1[i] = sc.nextInt();

            // Check even
            if (mark1[i] % 2 == 0) {
                System.out.println("Array No. is Even: " + mark1[i]);
            }

            // Sum
            sum = sum + mark1[i];

            // Max
            if (mark1[i] > max) {
                max = mark1[i];
            }

            // Min
            if (mark1[i] < min) {
                min = mark1[i];
            }
        }

        double avg = (double) sum / n;

        System.out.println("Sum of marks is: " + sum);
        System.out.println("Maximum mark is: " + max);
        System.out.println("Minimum mark is: " + min);
        System.out.println("Average of marks is: " + avg);
    }
}