package sample.pkg;

public abstract class Shape {

    public static Shape getWrapper(Point[] pts){
        Circle circleWrapper = Circle.getWrapper(pts);
        Rectangle rectangleWrapper = Rectangle.getWrapper(pts);
        Square squareWrapper = Square.getWrapper(pts);
        if(circleWrapper.getArea() < squareWrapper.getArea() &&
            circleWrapper.getArea() < rectangleWrapper.getArea())
            return circleWrapper;
        else if(rectangleWrapper.getArea() < squareWrapper.getArea() &&
                rectangleWrapper.getArea() < circleWrapper.getArea())
            return rectangleWrapper;
        else
            return squareWrapper;
    }// Factory pattern

    private final Point center;

    public Shape(Point center){
        this.center = center;
    }

    public Shape(){
        this(new Point());
    }

    public Point getCenter() {
        return center;
    }

    public void translate(int dx, int dy){
        this.center.translate(dx,dy);
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Shape{");
        sb.append("center=").append(center);
        sb.append('}');
        return sb.toString();
    }
}
