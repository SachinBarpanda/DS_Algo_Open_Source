package Lec3;

public class Pattern_15 {
    public static void main(String[] args) {
        int n = 5;
        int space = 0;
        int stars = 5;
        int rows = 1;
        while(rows < 2*n){
            int i = 1;
            while(i <= 2*space){
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while(j<= stars){
                System.out.print("* ");
                j++;
            }
            if(rows<n){
                stars--;
                space++;
            }else{
                space--;
                stars++;
            }
            rows++;
            System.out.println();
        }
    }
}
