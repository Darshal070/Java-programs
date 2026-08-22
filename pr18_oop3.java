public class pr18_oop3{
    String name;
    String color;
    public pr18_oop3(String name,String color){
        this.name=name;
        this.color=color;

    }
    void eat(){
        System.out.println("Name of animal is:"+name);
    }
    void sleep(){
        System.out.println("color of animal is:"+color);
    }

    public static void main(String[] args){
        pr18_oop3 cat=new pr18_oop3("cat","brown");
        cat.eat();
        cat.sleep();
    }
}