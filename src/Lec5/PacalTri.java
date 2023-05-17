package Lec5;

public class PacalTri {
    public static void main(String[] args) {
        int n = 6;
        int stars = 1;
        int rows = 0;
        while(rows < n){
            int i = 0;
            int val = 1;
            while(i < stars){
                System.out.print(val+" ");
                val = val*((rows-i))/(i+1);
                i++;
            }
            System.out.println();
            rows++;
            stars++;
        }
    }
}
