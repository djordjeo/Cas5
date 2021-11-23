package sample2.pkg;

public class NotUnaryExpression extends UnarryExpression{

    public NotUnaryExpression(Expression expression){
        super(expression);
    }

    @Override
    protected double evalImpl(double operandValue) {
        return operandValue !=0 ? 0 : 1;
    }
}
