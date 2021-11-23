package sample2.pkg;

public class MulBinaryExpression extends ArithmeticBinaryExpression{

    public MulBinaryExpression(Expression left, Expression right){
        super(left,right);
    }

    @Override
    protected double evalImpl(double leftValue, double rightValue) {
        return leftValue * rightValue;
    }
}
