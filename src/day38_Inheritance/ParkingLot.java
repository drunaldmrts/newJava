package day38_Inheritance;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota=new Toyota("Corolla","white",2022,23000,12345);

        BMW bmw=new BMW("X5","red",2020,23500,23456);

        Tesla tesla=new Tesla("Tesla1","black",2022,30000,3421);

        toyota.start();
        tesla.start();
        bmw.start();

    }
}
