package day37_Inheritence_SuperKeyword.animalTask;

public class AnimalObjects {
    public static void main(String[] args) {

        Dog dog1=new Dog("Alex","Kangal",'M',2,"big","white");

        System.out.println(dog1);

        Cat cat1=new Cat("Kısmet","Scottish",'F',1,"small","brown");

        System.out.println(cat1);

        dog1.bark();
        dog1.eat();
        dog1.drink();

        cat1.scratch();
        cat1.eat();
        cat1.drink();
    }
}
