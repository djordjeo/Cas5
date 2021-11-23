package sample2.pkg;

public class AddBinaryExpression extends ArithmeticBinaryExpression{

    public AddBinaryExpression(Expression left, Expression right){
        super(left,right);
    }

    @Override
    protected double evalImpl(double leftValue, double rightValue) {
        return leftValue + rightValue;
    }
}
