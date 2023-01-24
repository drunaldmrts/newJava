package day38_Inheritance;

public class Car {

    public String brand, model, color;
    public int year;
    public double price;
    public int miles;

    public Car(String brand, String model, String color, int year, double price, int miles) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
        this.miles = miles;
    }

    public void start(){
        System.out.println(brand+" "+model+" is starting");
    }

    public void drive(){
        System.out.println(brand+" "+model+" is driving");
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", miles=" + miles +
                '}';
    }
}
