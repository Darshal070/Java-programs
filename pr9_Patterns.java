class pr9_Patterns {
    public static void main(String[] args) {

        //Pattern 1
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int s = n - i; s > 0; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        //Pattern 2
        for (int i = n; i >= 1; i--) {
            for (int s = n - i; s > 0; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        //Pattern 3
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        //Pattern 4
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        //Pattern 5
        for (int i = 1; i <= n; i++) {
            for (int s = n - i; s > 0; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        //Pattern 6
        for (int i = n; i >= 1; i--) {
            for (int s = n - i; s > 0; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
