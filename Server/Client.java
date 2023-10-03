import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
public class Client {
    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket("localhost",8189)) {
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            new Thread(new Runnable() {
                @Override
                public void run() {
                    do{
                        try{
                            System.out.println("Server: " + in.readUTF());
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