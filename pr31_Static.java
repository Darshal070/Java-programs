class pr31_Static {

    int id = 101;
    static String college = "ABC College";

    public pr31_Static(int id) {
        this.id = id;
    }
    
    public static void main(String[] args) {
        pr31_Static s1 = new pr31_Static(101);
        System.out.println(s1.id + " " + pr31_Static.college);

        pr31_Static s2 = new pr31_Static(102);
        System.out.println(s2.id + " " + pr31_Static.college);

    }
}