package Lec33;

public class Student {
    String name;
    int age;
    static int countOfStudent;
    public void Intro_Yourself(){
        System.out.println("My name is "+name+" and age is "+age);
    }
    public void sayHey (String name){
        System.out.println(name + " Say Hey " + this.name);
    }
    public static void fun(){
        System.out.println("Teri toh");
    }
}
