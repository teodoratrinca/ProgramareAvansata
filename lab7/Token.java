import java.util.Objects;

public class Token {
    int number;
    public Token(int value)
    {
        this.number=number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "" + number;
    }

}
