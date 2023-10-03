import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8189)) {
            System.out.println("Ожидаем подключение клиента");
            Socket socket = serverSocket.accept();
            System.out.println("Клиент подключился");
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            new Thread(new Runnable() {
                @Override
                public void run() {
                    do{
                        try{
                            System.out.println("User: " + in.readUTF());
                        } catch (IOException e){
                            e.printStackTrace();
                        }
                    }while (true);
                }
            }).start();
            Scanner scanner = new Scanner(System.in);
            do {
                out.writeUTF(scanner.nextLine());
            } while (true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}