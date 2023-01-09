package day35_Encapsulation;

public class StudentObject {
    public static void main(String[] args) {

        Student student1= new Student("Daniel",34,'M','B',"MIT");

        student1.setGrade('D');
        student1.setAge(student1.getAge()+5);
        System.out.println(student1);
    }
}
