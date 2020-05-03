import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class GameClientJunior {
    static int port=2727;
   Socket socket;
    String serverAddress = "127.0.0.1";

    public GameClientJunior() throws IOException {
        this.socket = new Socket(serverAddress, port);
    }
    public void send(String request)throws IOException{
        OutputStreamWriter out=new OutputStreamWriter(socket.getOutputStream());
        BufferedWriter output=new BufferedWriter(out);
    }
    public String read(){
       Scanner scanner=new Scanner(System.in);
       return  scanner.next();
    }
    
    public static void main(String[] args) {
       try{
           GameClientJunior gameClientJunior=new GameClientJunior();
           while(true)
           {
               //Scanner scanner=new Scanner(System.in);
               String request=gameClientJunior.read();
               gameClientJunior.send(request);
           }
       } catch (IOException e) {
           e.printStackTrace();
       }
    }
}


