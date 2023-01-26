package day43_Abstraction.CarTask;

public final class Tesla extends Car {

    public Tesla(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println(getBrand()+getModel()+"Say START");
    }

    public void autoPilot(){
        System.out.println(getBrand()+getModel()+" has auto pilot feature");
    }


}
