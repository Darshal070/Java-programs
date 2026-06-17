
import java.net.*;
import java.io.*;

class Client1 {
    public static void main(String args[]) 
	throws Exception {

        Socket s = new Socket("localhost",5000);

        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String clientMsg="", serverMsg="";

        while(!clientMsg.equals("stop")){

            // client message
            System.out.print("Enter message for server: ");
            clientMsg = br.readLine();
            dos.writeUTF(clientMsg);

            // receive server reply
            serverMsg = dis.readUTF();
            System.out.println("Server: " + serverMsg);
        }

        s.close();
    }
}


