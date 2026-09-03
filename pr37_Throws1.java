class pr37_Throws1{
    public static void display() throws ArithmeticException{
        int a=10;
        int b=0;
        int c=a/b;
        System.out.println(c); 
    }
    public static void main(String args[]){
        try{
            display();
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}