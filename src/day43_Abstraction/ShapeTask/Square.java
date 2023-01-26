package day43_Abstraction.ShapeTask;

public final class Square extends Shape{

    private int side;

    public Square(String name, int side) {
        super(name);
        setSide(side);
    }

    public Square(String name) {
        super(name);
    }

    public int getSide() {
        if(side<=0){
            throw new RuntimeException("Invalid side: "+side);
        }
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int area() {
        return side*side;
    }

    @Override
    public int perimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + getName() +
                ", side=" + side +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
