package day36_Inheritance_Intro.animaltask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog=new Dog();
        dog.setInfo("Max","Hasky",'M',3,"small","black-white");
        dog.eat();
        dog.drink();
        dog.bark();

        System.out.println(dog);

        Cat cat=new Cat();
        cat.setInfo("Boncuk","Ankara",'F',4,"small","yellow");
        cat.eat();
        cat.drink();
        cat.meow();

        System.out.println(cat);


    }
}
