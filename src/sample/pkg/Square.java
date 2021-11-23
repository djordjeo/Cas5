package sample.pkg;

public class Square extends Rectangle{

    public static Square getWrapper(Point[] points){
        return new Square(new Point(),1);
    }

    public Square(Point center, double a) {
        super(center, a, a);
    }

    @Override
    public String toString() {
        return super.toString() + " - Square";
    }
}
