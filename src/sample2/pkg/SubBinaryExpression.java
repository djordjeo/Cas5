package sample2.pkg;

public class SubBinaryExpression extends ArithmeticBinaryExpression{

    public SubBinaryExpression(Expression left, Expression right){
        super(left,right);
    }

    @Override
    protected double evalImpl(double leftValue, double rightValue) {
        return leftValue - rightValue;
    }
}

