class pr24_override2 { 
    void area(int len, int bre,int r) { 
        int c = len*bre;
        System.out.println("Parent add: " + c);
    }
} 

class circle extends pr24_override2 { 
    void area(int len, int bre,int r) { 
        double c=(double) r*r*3.14;
        System.out.println("Child add: " + c);
    }
}

 class Main { 
    public static void main(String[] args) { 
        pr24_override2 a1 = new pr24_override2();
        a1.area(40,45,0);  

        circle a2 = new circle();
        a2.area(0,0,5);   
    } 
}
