package sample.pkg;

public class Main {

    public static void main(String[] args) {

        Point point1 = new Point(1,2);
        Point point2 = new Point();
        Point point3 = new Point(point1);

        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point3);

        Shape shape = new Rectangle(point1,1,2);
        Shape shape1 = foo();
        Shape[] arr = {
                new Rectangle(new Point(),5,4),
                new Square(new Point(),5),
                new Circle(new Point(2,3),4),
                new Rectangle(new Point(),5,5),
        };

        for(Shape shapes : arr){
            System.out.println(shapes.getArea());
            System.out.println(shapes.getPerimeter());
            System.out.println(shapes);
        }

        Point[] pts = {
                new Point(1,2),
                new Point(2,3),
                new Point(3,4),
                new Point(4,5),
        };

        Circle circleWrapper = Circle.getWrapper(pts);
        Rectangle rectangleWrapper = Rectangle.getWrapper(pts);
        Square squareWrapper = Square.getWrapper(pts);
        Shape shapeWrapper = Shape.getWrapper(pts);
        System.out.println(shapeWrapper);
    }

    public static Shape foo(){
        return new Rectangle(new Point(),5,4);
    }



}
