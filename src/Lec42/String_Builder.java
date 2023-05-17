package Lec42;

public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        sb.append('c');
        sb.append("Hello");
        System.out.println(sb);
        String str = sb.toString();
        System.out.println(str);
        System.out.println(sb.reverse());
        String s = "HelloBuddy";
        StringBuilder sb1 = new StringBuilder(s);
        System.out.println(sb1.capacity());//increase by (OG*2+2)
        System.out.println(sb1.indexOf("lo"));
    }
}
