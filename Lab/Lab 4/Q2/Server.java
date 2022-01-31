import java.io.IOException;
import java.net.*;
public class Server {
    public static void main(String[] args) throws IOException{
        ServerSocket obj = new ServerSocket(8080);
        System.out.println("Connecting");
        Socket socket = obj.accept();
        System.out.println("Connected with client");
        socket.close();
        obj.close();

    }
}
