package sample2.pkg;

public class Main {

    public static void main(String[] args) {
//        Expression expression = new NotUnaryExpression(new LiteralExpression(5));
//        System.out.println(expression.eval());


        Expression expression = new AddBinaryExpression(
                new MulBinaryExpression(
                        new LiteralExpression(3),
                        new SubBinaryExpression(
                                new LiteralExpression(4),
                                new LiteralExpression(5)
                        )
                ),
                new NegateUnaryExpression(
                        new LiteralExpression(5)
                )
        ) {
        } ;

        System.out.println(expression.eval());

    }

}
