import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Board {
    int sizeTokens;
    int nrTokens;
    List<Token> tokensL = new ArrayList<>();

    public synchronized Token getToken() {
      Random random=new Random();
        try {
            Token actualT=tokensL.get(random.nextInt(nrTokens));
            tokensL.remove(random.nextInt(nrTokens));
            return  actualT;
        } catch (Exception e) {
            System.out.println("Error, no tokens to get");
            return null;
        }
    }

    public void addT(Token token){
        this.tokensL.add(token);
    }

    public int getNrTokens() {
        return nrTokens;
    }

    public void setNrTokens(int nrTokens) {
        this.nrTokens = nrTokens;
    }

    public void setSizeTokens(int sizeTokens) {
        this.sizeTokens = sizeTokens;
    }

    public int getSizeTokens() {
        return sizeTokens;
    }

    public List<Token> getTokensL() {
        return tokensL;
    }

    public void setTokensL(List<Token> tokensL) {
        this.tokensL = tokensL;
    }

}
