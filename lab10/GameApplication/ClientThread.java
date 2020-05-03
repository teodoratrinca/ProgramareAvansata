import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

class ClientThread extends Thread {
    private final GameServer serverGame;
    private Socket socket = null;

    public ClientThread(GameServer serverGame, Socket socket) {
        this.serverGame = serverGame;
        this.socket = socket;
    }

    public void run() {
        try {
            //String request;
            while (true) {
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(socket.getInputStream()));
                String request = in.readLine();
                String answer;

                if (request.equals("stop")) {
                    System.out.println("Client want to stop conn.");
                    System.exit(0);


                }
                if (request.equals("exit")) {
                    System.out.println("Close this connection");
                    this.socket.close();
                    System.out.println("Connection closed");
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

