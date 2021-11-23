package sample2.pkg;

public class LiteralExpression extends Expression{

    private final int value;

    public LiteralExpression(int literal){
        value = literal;
    }

    @Override
    public double eval() {
        return this.value;
    }
}
