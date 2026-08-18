class pr14_jumpingstmt {

    public static void main(String[] args) {

        //break stmt
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        //continue stmt
        for (int i = 1; i <= 10; i++) {
            //    System.out.println(i);
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
} 