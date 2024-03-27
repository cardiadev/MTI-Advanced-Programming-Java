import java.io.*;
import java.net.*;

class Inet_tcp_server_int {

   ServerSocket server;
   Socket ns;
   DataOutputStream out;
   DataInputStream in;
   int numero;

  public void listenSocket(){
    try{
      server = new ServerSocket(2004, 10); 

      ns = server.accept();

      System.out.println("reading from socket...");
      in = new DataInputStream(ns.getInputStream());
      numero = in.readInt();
      System.out.println("Server received: " + numero);


      System.out.println("writing to socket");
      out = new DataOutputStream(ns.getOutputStream());
      out.flush();
      out.writeInt(numero);
      out.flush();
    } 
    catch (IOException e) {
      System.out.println("Accept failed: 4444");
      System.exit(-1);
    }
  }

  protected void finalize(){
//Clean up 
     try{
        in.close();
        out.close();
        server.close();
    } catch (IOException e) {
        System.out.println("Could not close.");
        System.exit(-1);
    }
  }

  public static void main(String[] args){
      System.out.println("Echo Server...");
        Inet_tcp_server_int s = new Inet_tcp_server_int();

	s.listenSocket();
        s.finalize();
  }
}
