package day43_Abstraction.CarTask;

public final class Audi extends Car{

    public Audi(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Push the start button");
    }
    public void autoPark(){
        System.out.println(getBrand()+getModel()+" has auto park");
    }

}
