package day38_Inheritance;

public class BMW extends Car {


    public BMW( String model, String color, int year, double price, int miles) {
        super("BMW", model, color, year, price, miles);
    }
    public void racing(){
        System.out.println(brand+" "+model+" is racing");
    }

    @Override
    public void start() {
        System.out.println(brand+" "+model+" call mechanic to jump start");
    }
}
