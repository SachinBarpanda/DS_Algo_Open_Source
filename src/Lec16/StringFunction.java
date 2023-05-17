package Lec16;

public class StringFunction {
    public static void main(String[] args) {
        String s = "HelloByeOkKeyHey";
        System.out.println(s.length());
        System.out.println(s.charAt(5));
        String s1 = "HelloByeOkKeyHey";
        System.out.println(s.equals(s1));
        String s2 = "raju";
        String s3 = "rdju";
        System.out.println(s2.compareTo(s3));
        System.out.println(s.substring(3));
        System.out.println(s.substring(0,6));
    }
}
