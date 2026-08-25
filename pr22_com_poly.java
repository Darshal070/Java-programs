class pr22_com_poly{
    void add(int a,int b){
        int c=a+b;
        System.out.println("Addition is:"+c);
    }

    void add(double a,double b){
        double d=a+b;
        System.out.println("Addition of float no is:"+d);
    }

    public static void main(String[] args) {
        pr22_com_poly p1=new pr22_com_poly();
        p1.add(10,20);
        p1.add(10.0,20.0);
    }
}