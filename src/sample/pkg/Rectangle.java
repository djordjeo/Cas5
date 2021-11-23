package sample.pkg;

public class Rectangle extends Shape{

    public static Rectangle getWrapper(Point[] points){
        return new Rectangle(new Point(),1,1);
    }

    private double a, b;

    public Rectangle(Point center, double a, double b){
        super(center);
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public double getPerimeter() {
        return 2*(a+b);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rectangle{");
        sb.append("a=").append(a);
        sb.append(", b=").append(b);
        sb.append('}');
        return super.toString() + sb.toString();
    }
}
