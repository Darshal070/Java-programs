class pr23_Overriding { 
    void add(int a, int b) { 
        int c = a + b;
        System.out.println("Parent add: " + c);
    }
} 

class cal1 extends pr23_Overriding { 
    @Override
    void add(int a, int b) { 
        int c = a + b;
        System.out.println("Child add: " + c);
    }
}

 class Main { 
    public static void main(String[] args) { 
        pr23_Overriding a1 = new pr23_Overriding();
        a1.add(23, 45);  

        cal1 a2 = new cal1();
        a2.add(78, 65);   

        pr23_Overriding a3 = new cal1();
        a3.add(10, 20);   
    } 
}
