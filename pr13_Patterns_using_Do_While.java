class pr13_Patterns_using_Do_While{
    public static void main(String[] args) {
        
        //Pattern 1
        int i = 1;
        do {
            int j = 4 - i;
            do {
                if (j > 0) System.out.print(" ");
                j--;
            } while (j > 0);
            int k = 1;
            do {
                if (k <= i) System.out.print(k + " ");
                k++;
            } while (k <= i);
            System.out.println();
            i++;
        } while (i <= 4);

        //Pattern 2
        i = 4;
        do {
            int j = 4 - i;
            do {
                if (j > 0) System.out.print(" ");
                j--;
            } while (j > 0);

            int k = 1;
            do {
                if (k <= i) System.out.print(k + " ");
                k++;
            } while (k <= i);
            System.out.println();
            i--;
        } while (i >= 1);

        //Pattern 3
        i = 1;
        do {
            int j = 1;
            do {
                if (j <= i) System.out.print("* ");
                j++;
            } while (j <= i);
            System.out.println();
            i++;
        } while (i <= 4);

        //Pattern 4
        i = 4;
        do {
            int j = 1;
            do {
                if (j <= i) System.out.print("* ");
                j++;
            } while (j <= i);
            System.out.println();
            i--;
        } while (i >= 1);

        //Pattern 5
        i = 1;
        do {
            int j = 4 - i;
            do {
                if (j > 0) System.out.print(" ");
                j--;
            } while (j > 0);

            int k = 1;
            do {
                if (k <= i) System.out.print("* ");
                k++;
            } while (k <= i);
            System.out.println();
            i++;
        } while (i <= 4);

        //Pattern 6
        i = 4;
        do {
            int j = 4 - i;
            do {
                if (j > 0) System.out.print(" ");
                j--;
            } while (j > 0);

            int k = 1;
            do {
                if (k <= i) System.out.print("* ");
                k++;
            } while (k <= i);
            System.out.println();
            i--;
        } while (i >= 1);
    }
}