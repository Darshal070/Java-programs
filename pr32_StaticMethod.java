class pr32_StaticMethod{
    static void main(){
        int a=10;
        System.out.println("Static block executed"+a);
    }

    public static void show(){
        System.out.println("Static method is invoked");
    }

    public static void main(String[] args) {
        main();
        show();
    }
}