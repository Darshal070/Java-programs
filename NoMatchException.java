
import java.io.BufferedReader;
import java.io.InputStreamReader;

class NoMatchException extends Exception
{

    NoMatchException(String str)
    {
        super(str);
    } 
}
class Sample
{
    public static void main(String[] args)
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String:");
        String s1=br.readLine();
        try
        {
            if(s1.equals("DARSHAL"))
            {
                System.err.println("String is Equal");
            }
          else
          {
            throw new NoMatchException("String are not Equals");
          }
        }
        catch(NoMatchException e)
        {
            System.err.println(e);
        }
    }
}