import java.net.*;
import java.io.*;

public class URLConnectionDemo 
{
    public static void main(String[] args) 
	{
        try 
		{
            URL url = new URL("https://www.example.com");
            URLConnection connection = url.openConnection();

            System.out.println("Content Type: " + connection.getContentType());
            System.out.println("Content Length: " + connection.getContentLength());
            System.out.println("Last Modified: " + connection.getLastModified());
            System.out.println("Date: " + connection.getDate());

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));

            String line;
            while ((line = br.readLine()) != null)
				{
                System.out.println(line);
            }

            br.close();

        }
		catch (Exception e) 
		{
            System.out.println(e);
        }
    }
}