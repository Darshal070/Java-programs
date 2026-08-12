
import java.util.Scanner;

class pr6_Switchcaseex2{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the char");
        char ch=sc.next().charAt(0);

        switch(ch){
            case 'a':
                System.out.println("vovel");
                break;

                case 'e':
                System.out.println("vovel");
                break;

                case 'i':
                System.out.println("vovel");
                break;

                case 'o':
                System.out.println("vovel");
                break;

                case 'u':
                System.out.println("vovel");
                break;

                default:
                System.out.println("consonent");
                break;

        }
    }
}