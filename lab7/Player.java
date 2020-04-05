import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Player implements Runnable {
    String name;
    List<Token> tokensP = new ArrayList<>();
    Board board;

    public Player(String name) {
        this.name = name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Board getBoard() {
        return board;
    }

    @Override
    public void run() {
        while(board.getNrTokens()!=0)
        { try
             {
             tokensP.add(board.getToken());
         }catch (Exception e)
        {
            System.out.println("Error, no board avable");
        }
        }
    }
}

