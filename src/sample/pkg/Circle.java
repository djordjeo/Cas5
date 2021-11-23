package sample.pkg;

public class Circle extends Shape{

    public static Circle getWrapper(Point[] points){
        return new Circle(new Point(),1);
    }

    private double r;

    public Circle(Point center, double r){
        super(center);
        this.r = r;
    }

    @Override
    public double getArea() {
        return r*r*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2*r*Math.PI;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Circle{");
        sb.append("r=").append(r);
        sb.append('}');
        return sb.toString();
    }
}
