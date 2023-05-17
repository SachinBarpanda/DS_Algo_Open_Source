package Lec34;

public class Person_Client {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        Person p1 = new Person("Yetri",23);
        Person p2 = new Person("Suman",24);
        p.intro_de();
        p1.intro_de();
        p2.intro_de();
        p1.setAge(-2);
        System.out.println(p1.getAge());
    }
}
