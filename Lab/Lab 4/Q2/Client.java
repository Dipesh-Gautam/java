import java.io.*;
import java.net.*;
public class Client {
    public static void main(String[] args){
        try{
            Socket socket = new Socket("localhost",8080);
            System.out.println("Connected to the server");
            socket.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
}
