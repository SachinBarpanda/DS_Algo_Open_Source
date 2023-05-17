package Lec19;

public class Wrapper_Class {
    public static void main(String[] args) {
        Integer a = 156;
        int a1 = 156;
        System.out.println(a==a1);
        Integer c = 12;
        Integer c1 = 12;
        Integer d = 167;
        Integer d1 = 167;
        System.out.println(c==c1);//true
        System.out.println(d==d1);//false
    }

}
