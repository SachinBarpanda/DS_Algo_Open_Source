package Lec7;

public class Char_cast_type {
    public static void main(String[] args) {
        char c = 'a';
        int i =  c;
        System.out.println(i);
        int ch = c+1;
        char ch1= (char)ch;
        System.out.println(ch1);

    }
}
