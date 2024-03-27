import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Server {
    
    private static boolean serverRunning = true;
    private static int port = 2004;

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening on port " + port);
            System.out.println("If you want to close the server, type 'exit' and press Enter");

            new Thread(() -> {
                try (Scanner scanner = new Scanner(System.in)) {
                    while (true) {
                        String command = scanner.nextLine();
                        if ("exit".equalsIgnoreCase(command)) {
                            serverRunning = false;
                            try {
                                serverSocket.close();
                                System.out.println("Closing all connections...");
                                System.exit(0);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break;
                        }
                    }
                }
            }).start();

            while (serverRunning) {
                try (Socket socket = serverSocket.accept();
                     DataInputStream in = new DataInputStream(socket.getInputStream());
                     DataOutputStream out = new DataOutputStream(socket.getOutputStream())) {
                     
                    System.out.println("New client connected");

                    int size = in.readInt();
                    int[] numbers = new int[size];

                    for (int i = 0; i < size; i++) {
                        numbers[i] = in.readInt();
                    }

                    int max = greatest(numbers);

                    out.writeInt(max);

                    System.out.println("Closing connection with client");
                } catch (IOException ex) {
                    if (serverRunning) {
                        System.out.println("Server exception: " + ex.getMessage());
                        ex.printStackTrace();
                    }
                }
            }
        } catch (IOException ex) {
            System.out.println("Server exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static int greatest(int[] v) {
        int max = v[0];
        for (int num : v) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
