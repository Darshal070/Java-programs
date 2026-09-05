class pr41_StringProgram{
    public static void main(String[] args) {
        String s1="darshal";
        String s2=new String("darshal");
        String s3="darshal";
        System.out.println(s1==s3);

        //Methods of String
        System.out.println("Length of string:"+s1.length());
        System.out.println("Character At:"+s1.charAt(6));
        System.out.println("indext of d is:"+s1.indexOf('d'));
        System.out.println("Concate String:"+s1.concat(s3));
        System.out.println("To Uppercase:"+s1.toUpperCase());
        System.out.println("To Lowercase:"+s1.toLowerCase());
        System.out.println("Start with:"+s1.startsWith("d"));
        System.out.println("Equal ignore case:"+s1.equalsIgnoreCase(s3));
        System.out.println("String Equals:"+s1.equals(s3));
        System.out.println("Ends With:"+s1.endsWith("l"));
        System.out.println("String Contains:"+s1.contains("a"));
    }
}