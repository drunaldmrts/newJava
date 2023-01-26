package day43_Abstraction.ShapeTask;

public final class Rectangle extends Shape {
    public Rectangle(String name, int length, int width) {
        super(name);
        setLength(length);
        setWidth(width);
    }

    private int length;
    private int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if(length<=0){
            throw new RuntimeException("Invalid number");
        }
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if(width<=0){
            throw new RuntimeException("Invalid number");
        }
        this.width = width;
    }

    public Rectangle(String name) {
        super(name);
    }


    @Override
    public int area() {
        return length*width;
    }

    @Override
    public int perimeter() {
        return 2*(length+width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name='" + getName() + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }

}
