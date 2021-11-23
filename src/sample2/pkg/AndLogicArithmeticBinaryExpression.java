package sample2.pkg;

public abstract class AndLogicArithmeticBinaryExpression extends LogicBinaryExpression{

    public AndLogicArithmeticBinaryExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double eval() {
        boolean leftValue = getLeft().eval() != 0;
        if(!leftValue)
            return 0;
        boolean rightValue = getRight().eval() != 0;
        return rightValue ? 1 : 0;
    }
}
