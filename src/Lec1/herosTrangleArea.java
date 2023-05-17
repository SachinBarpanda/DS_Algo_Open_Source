package Lec1;

public class herosTrangleArea {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        int s = (a+b+c)/2;
        int area = s*(s-a)*(s-b)*(s-c);
        System.out.println(Math.pow(area,(1.0/2)));
        System.out.println(Math.sqrt(area));
    }
}
