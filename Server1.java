

import java.net.*;
import java.io.*;

class Server1 {
    public static void main(String args[]) throws Exception {

        ServerSocket ss = new ServerSocket(5000);
        System.out.println("Server is waiting for client...");

        Socket s = ss.accept();
        System.out.println("Client connected");

        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String clientMsg="", serverMsg="";

        while(!clientMsg.equals("stop")){

            // receive message from client
            clientMsg = dis.readUTF();
            System.out.println("Client: " + clientMsg);

            // server reply
            System.out.print("Enter message for client: ");
            serverMsg = br.readLine();
            dos.writeUTF(serverMsg);
        }

        s.close();
        ss.close();
    }
}

