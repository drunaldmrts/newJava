package day43_Abstraction.ShapeTask;

public class Shapeobject {

    public static void main(String[] args) {

        Rectangle rectangle=new Rectangle("Rectangle",14,34);

        Square square=new Square("Square",24);

        Circle circle=new Circle("Circle",34);

        rectangle.area();
        rectangle.perimeter();

        square.area();
        square.perimeter();

        circle.area();
        circle.perimeter();

        System.out.println(rectangle);
        System.out.println(square);
        System.out.println(circle);

    }
}
