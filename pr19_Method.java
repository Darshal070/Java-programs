class pr19_Method {

    //Method with no return type and no parameters
    public void add() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("sum = " + c);
    }

    //Method with return type and no parameter
    public int sub() {
        int num1 = 20;
        int num2 = 10;
        int n = num1 - num2;
        return n;
    }

    //Method with return type and parameter
    public int square(int num) {
        int sq = num * num;
        return sq;
    }


    //Calculating Avarage
    public int average(int m1, int m2, int m3) {
        int sum = m1 + m2 + m3;
        int avg = sum / 3;  
        return avg;
    }

    public static void main(String[] args) {
        pr19_Method M1 = new pr19_Method();
        M1.add();

        int sub1 = M1.sub();
        System.out.println(sub1);

        System.out.println(M1.square(sub1));

        int s1 = 85;
        int s2 = 90;
        int s3 = 80;

        int result = M1.average(s1, s2, s3);
        System.out.println("Average marks = " + result);
    }
}