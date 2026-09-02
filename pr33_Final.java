class pr33_Final {
    final static int a = 10;

    public void display() {
        System.out.println("Final class method..");
    }
}

class subfinal extends pr33_Final {
    public void display() {
        System.out.println("Subclass method..");
    }

    public static void main(String args[]) {
        subfinal s1 = new subfinal();
        s1.display();  
    }
}