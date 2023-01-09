package day35_Encapsulation;

public class EmployeeObject {

    public static void main(String[] args) {
        Employee e1= new Employee("Ali",23,'F',23000);
        System.out.println(e1);

        e1.setGender('M');
        System.out.println(e1);

        Employee e2= new Employee("Ayşe",28,'F',12);
        System.out.println(e2);

        e2.setSalary(100000);
        System.out.println(e2);
    }
}
