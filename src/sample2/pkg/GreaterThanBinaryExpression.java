package sample2.pkg;

public abstract class GreaterThanBinaryExpression extends RelationBinaryExpression{

    public GreaterThanBinaryExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    protected double evalImpl(double leftValue, double rightValue) {
        return leftValue > rightValue ? 1 : 0;
    }
}
