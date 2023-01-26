package day43_Abstraction.ShapeTask;

public final class Circle extends Shape {
    public Circle(String name, int radius) {
        super(name);
        setRadius(radius);
    }

    private int radius;
    public static double pi=3.14;

    public Circle(String name) {
        super(name);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if(radius<=0){
            throw new RuntimeException("Invalid number");
        }
        this.radius = radius;
    }

    @Override
    public int area() {
        return (int) (radius*radius*pi);
    }

    @Override
    public int perimeter() {
        return (int) (radius*pi*2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + getName() + '\'' +
                ", radius=" + radius +
                ", pi=" + pi +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
