package day43_Abstraction.CarTask;

public class CarShop {

    public static void main(String[] args) {

        //Car car1= new Car("Unal","79","White",1979,100000);
        // we cannot create object from Abstract class

        Honda honda=new Honda("Honda","Jazz","Black",2020,23000);
        Audi audi=new Audi("Audi","Q7","Green",2022,40000);
        Tesla tesla=new Tesla("Tesla","M2","Black",2023,55000);


        audi.setModel("2021");
        honda.setColor("blue");
        tesla.setPrice(70000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        tesla.autoPilot();
        audi.autoPark();

    }
}
