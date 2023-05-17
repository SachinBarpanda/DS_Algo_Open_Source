package Lec25;

public class Tower_of_hanoi {
    public static void main(String[] args) {
        String src = "A";
        String help = "B";
        String des = "C";
        int n = 3;
        TOH(n,src,help,des);
    }

    private static void TOH(int n, String src, String help, String des) {
        TOH(n-1,src,des,help);
        System.out.println("Move "+n+"th disk from "+src +" to "+des);

    }
}
