package sample2.pkg;

public abstract class UnarryExpression extends Expression{

    private final Expression operand;

    public UnarryExpression(Expression expression){
        operand = expression;
    }

    public Expression getOperand() {
        return operand;
    }

    @Override
    public double eval() {
        double operandValue = this.operand.eval();
        return evalImpl(operandValue);
    }

    protected abstract double evalImpl(double operandValue);
}
