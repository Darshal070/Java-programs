class a{
    void display(){
        System.out.println("Parent class");
    }
}

class b extends a{
    void show(){
        System.out.println("Child class 1");
    }
}

class pr21_hirarchicale extends a{
    void show(){
        System.out.println("Child class 2");
    }
    public static void main(String[] args) {
        b b1=new b();
        pr21_hirarchicale c1=new pr21_hirarchicale();

        b1.display();
        b1.show();
        c1.display();
        c1.show();
    }
} 