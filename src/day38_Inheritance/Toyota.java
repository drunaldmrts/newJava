package day38_Inheritance;

public class Toyota extends Car {


    public Toyota( String model, String color, int year, double price, int miles) {
        super("Toyota", model, color, year, price, miles);
    }
    public void reliable(){
        System.out.println(brand+" "+model+" is reliable");
}
    @Override
    public void start(){
        System.out.println(brand+" "+model+" twist the key to ignition to start");
    }

}
