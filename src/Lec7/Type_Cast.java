package Lec7;

public class Type_Cast {
    public static void main(String[] args) {
        byte b = (byte)132;
        System.out.println(b);
        int i = 300;
        short s= 677;
//        short b1 = (short) i;
        byte b1 = (byte)i;
        System.out.println(b1);

        byte b4 = 14;
        int i2 = (byte)b4;
        System.out.println(i2);

        int ll1 = 2147483647;
        long c = (long)ll1+2;
        System.out.println(c);

        byte i6 = 127;
        System.out.println(++i6);
        boolean b8 = (i6<128);
        System.out.println(b8);

        int i29 = 2147483647;
        int i90 = 2147483647;
        long i2990 = (long)i29+i90;
        System.out.println(i2990);
    }
}
