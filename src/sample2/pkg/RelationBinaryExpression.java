package sample2.pkg;

public abstract class RelationBinaryExpression extends BinaryExpression{

    public RelationBinaryExpression(Expression left, Expression right) {
        super(left, right);
    }


    @Override
    public double eval() {
        double leftValue = getLeft().eval();
        double rightValue = getRight().eval();
        return evalImpl(leftValue,rightValue);
    }

    protected abstract double evalImpl(double leftValue, double rightValue);

}
