class pr35_Exceptionex2 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        try {
            System.out.println(arr[4]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred:" + e);
        } 
        finally {
            System.out.println("Finally block executed");
        }
    }
}