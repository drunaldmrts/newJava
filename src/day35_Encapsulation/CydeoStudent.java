package day35_Encapsulation;

public class CydeoStudent {

   public String name;
   public int age;
   public char gender;
   public int batchNumber;
   public int groupNumber;
   public String fieldOfStudy;

   public static String schoolName;
   public static String programmingLanguage;
   public static String secretCode;

    public CydeoStudent(String name, int age, char gender, int batchNumber, int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    static {
        schoolName="Cydeo";
        programmingLanguage="JAVA";
        secretCode="Wooden Spoon";
    }

    public static void printSchoolName(){
        System.out.println("school is "+schoolName);
    }

    public static void printSecretCode(){
        System.out.println("code is "+secretCode);
    }

    public void attendClass(){
        System.out.println(name+ " is attending class");
    }

    public void study(){
        System.out.println(name+" is studying");
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", school='" + schoolName + '\'' +
                ", programming language='" + programmingLanguage + '\'' +
                '}';
    }
}
