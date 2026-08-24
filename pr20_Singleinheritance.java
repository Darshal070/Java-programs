class Pr20_SingleInheritance {
    String name = "Inheritance";

    public void show() {
        System.out.println("Parent class Method");
    }
}

class SubInheritance extends Pr20_SingleInheritance {
    public void display() {
        System.out.println("Method in sub Method");
    }

    public static void main(String[] args) {
        SubInheritance c1 = new SubInheritance();
        c1.show();      
        c1.display();   
    }
}
