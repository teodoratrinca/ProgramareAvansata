import javax.swing.text.PlainDocument;

public class Game {

    public Game() {
        Board board = new Board();
        board.setNrTokens(20);
        int numberOfTokens = board.getNrTokens();
        for (int i = 1; i <= numberOfTokens; i++) {
            if (i <= board.getSizeTokens()) {
                board.addT(new Token(i));
            } else {
                board.addT(new Token(0));
            }

        }
        Runnable runn1 = new Player("Beatrice");
        Runnable runn2 = new Player("Andra");
        Runnable runn3 = new Player("Teo");
        while (numberOfTokens > 1) {
            new Thread(runn1).start();
            new Thread(runn2).start();
            new Thread((runn3)).start();
        }
    }
}

