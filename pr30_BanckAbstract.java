abstract class pr30_BanckAbstract{
    abstract void Rate_of_Interast();
}
class SBI extends pr30_BanckAbstract{
    void Rate_of_Interast(){
        System.out.println("Rate of interast of SBI bank is:9.55%");
    }
}
class HDFC extends pr30_BanckAbstract{
    void Rate_of_Interast(){
        System.out.println("Rate of interast of HDFC bank is:10.53%");
    }
}
class Main{
    public static void main(String[] args) {
        SBI s1=new SBI();
        s1.Rate_of_Interast();

        HDFC h1=new HDFC();
        h1.Rate_of_Interast();
    }
}