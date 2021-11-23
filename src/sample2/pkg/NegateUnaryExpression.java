package sample2.pkg;

public final class NegateUnaryExpression extends UnarryExpression{

    public NegateUnaryExpression(Expression expression){
        super(expression);
    }

    @Override
    protected double evalImpl(double operandValue) {
        return -operandValue;
    }
}
