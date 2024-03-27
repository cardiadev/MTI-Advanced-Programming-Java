import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Inet_tcp_client_int {
    public static void main(String[] args) {
        Socket echoSocket = null;
        DataOutputStream os = null;
        DataInputStream is = null;
	//DataInputStream stdIn = new DataInputStream(System.in);
	Scanner stdIn = new Scanner( System.in );

        System.out.println("Echo Client...\nIntroduce an integer number and return\n");
        try {
            echoSocket = new Socket("localhost", 2004);
            os = new DataOutputStream(echoSocket.getOutputStream());
            is = new DataInputStream(echoSocket.getInputStream());
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host: localhost");
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to: taranis");
        }

        if (echoSocket != null && os != null && is != null) {
            try {
                int userInput;

               // while ((userInput = stdIn.readLine()) != null) {
                    userInput = stdIn.nextInt();
                    os.writeInt(userInput);
                    System.out.println("Client received: " + is.readInt());
                //}
                os.close();
                is.close();
                echoSocket.close();
            } catch (IOException e) {
                System.err.println("I/O failed on the connection to: localhost");
            }
        }
    }
}
