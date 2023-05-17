package Lec32;

import java.util.Random;

public class Random_Number {
    public static void main(String[] args) {
        int low = 10;
        int high = 100;
        Random rn  = new Random();
        for (int i = 0; i < 10; i++) {
            int r = rn.nextInt(high-low+1)+low;
            System.out.print(r+" ");
        }
    }
}
