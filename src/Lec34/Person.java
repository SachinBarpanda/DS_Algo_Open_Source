package Lec34;

public class Person {
    private String name = "Anish";
    private int age = 22;

    public void setAge(int age) throws Exception {
        try {
            if (age < 0) {
                throw new Exception("Lol -ve nahi");
            }
            this.age = age;
        }catch (Exception e){
            e.printStackTrace();
        }finally {

        }
    }
    public void intro_de(){
        System.out.println("My name is " + name + " age is : " + age);
    }
    public Person(){
        this.name = "Amisha";
        this.age = 24;
    }
    public Person(String str , int age){
        this.name = str;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
