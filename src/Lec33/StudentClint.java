package Lec33;

public class StudentClint {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student();
        s.age= 23;
        s.name = "Soren";
        s.Intro_Yourself();
        s1.age = 22;
        s1.name="Siren";
        s1.Intro_Yourself();
        s.sayHey("Priya");
        int x = Student.countOfStudent;
        Student.fun();
    }
}
