package day38_Inheritance;

public class Tesla extends Car{


    public Tesla( String model, String color, int year, double price, int miles) {
        super("Tesla", model, color, year, price, miles);
    }

    public void autopilot(){

        System.out.println(brand+" "+model+" in autopilot mode");
    }

}
