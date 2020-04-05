import java.util.Objects;

public class Token {
    int value;

    public Token(int value)
    {
        this.value=value;
    }

    protected synchronized int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "" + value;
    }

}
