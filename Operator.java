class Operator{
    public static void main(String[] args) {
        int a=10;
        int b=20;

        //Arithmetic operators
        System.out.println("10+20="+(a+b));
        System.out.println("10-20="+(a-b));
        System.out.println("10/20="+(a/b));
        System.out.println("10*20="+(a*b));
        System.out.println("10%20="+(a%b));

        //Comparison operators
        System.out.println(a>b);
        System.out.println(a==10);
        System.out.println(10>=10);
        System.out.println(b<=a);

        //Logical operators
        System.out.println((a==10) && (b>a));
        System.out.println((a==10) && (b<a));
        System.out.println((a==10) || (b<a));
        System.out.println(!(b==20));

        //Unary operators
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(--b);
        System.out.println(b--);

        //Assignment operators
        System.out.println(a+=5);
        System.out.println(b-=5);
        System.out.println(b*=2);
        System.out.println(b/=2);

        //Ternary operator
        int max=(a>b)?a:b;
        System.out.println("Maximum value is: " + max);
    }
}