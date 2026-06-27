import java.net.InetAddress;

public class HostInfo 
{
    public static void main(String[] args) 
	{
        try 
		{
            InetAddress address = InetAddress.getLocalHost();

            String hostName = address.getHostName();

            String ipAddress = address.getHostAddress();

            System.out.println("Host Name: " + hostName);
            System.out.println("IP Address: " + ipAddress);

        } 
		catch (Exception e)
		{
            System.out.println("Error occurred: " + e);
        }
    }
}