package day35_Encapsulation;

public class Student {

    public Student(String name, int age, char gender, char grade, String schoolName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    private String name;
    private int age;
    private char gender, grade;

    private String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public char getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age<5 || age>90){
            return; // exists the method
        }
        this.age = age;
    }

    public void setGender(char gender) {
        if(!(gender=='M'||gender=='F')){
            return;
        }
        this.gender = gender;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setGrade(char grade) {
        if(!(grade=='A'||grade=='B'||grade=='C'||grade=='D'||grade=='F')){
            return;
        }
        this.grade = grade;
    }
}
