public class pr12_Patterns_using_While {
    public static void main(String[] args) {

        //Pattern 1
        int i = 1;
        while (i <= 4) {
            int j = 4 - i;
            while (j > 0) {
                System.out.print(" ");
                j--;
            }
            int k = 1;
            while (k <= i) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
            i++;
        }

        //Pattern 2
        i = 4;
        while (i >= 1) {
            int j = 4 - i;
            while (j > 0) {
                System.out.print(" ");
                j--;
            }
            int k = 1;
            while (k <= i) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
            i--;
        }

        //Pattern 3
        i = 1;
        while (i <= 4) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }

        //Pattern 4
        i = 4;
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i--;
        }

        //Pattern 5
        i = 1;
        while (i <= 4) {
            int j = 4 - i;
            while (j > 0) {
                System.out.print(" ");
                j--;
            }
            int k = 1;
            while (k <= i) {
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i++;
        }

        //Pattern 6
        i = 4;
        while (i >= 1) {
            int j = 4 - i;
            while (j > 0) {
                System.out.print(" ");
                j--;
            }
            int k = 1;
            while (k <= i) {
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i--;
        }
    }
}
