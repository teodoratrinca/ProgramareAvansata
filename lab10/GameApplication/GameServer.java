
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class GameServer {
    //int port = 2727;
    private final ServerSocket serverSocket=null;
    public static void main(String[] args)throws IOException{
        GameServer server=new GameServer();
    try  {
            ServerSocket serverSocket = new ServerSocket(2727);
            System.out.println("Server is listening on port " + 2727);
        while(true)
        {
            System.out.println("Waiting for a client");
            Socket socket = serverSocket.accept();
            System.out.println("New client connected");
            new ClientThread(server,socket).start();
    }
    }catch (IOException e) {
        System.err.println(e);  }
    }
}

   


