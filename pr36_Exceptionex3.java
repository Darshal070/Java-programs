class pr36_Exceptionex3{
    
    public static void main(String[] args) {
        String name = null;

        try {
            System.out.println(name.length());
        } 
        catch (NullPointerException e) {
            System.out.println("Exception occurred: " + e);
        } 
        finally {
            System.out.println("Finally block executed");
        }
    }
}