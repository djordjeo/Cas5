package sample2.pkg;

public abstract class BinaryExpression extends Expression {

    private final Expression left;
    private final Expression right;

    public BinaryExpression(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    @Override
    public double eval() {
        double leftValue = getLeft().eval();
        double rightValue = getRight().eval();
        return evalImpl(leftValue,rightValue);
    }

    protected abstract double evalImpl(double leftValue, double rightValue);
}
