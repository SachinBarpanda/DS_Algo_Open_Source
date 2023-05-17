package Lec3;

public class Pattern_17 {
    public static void main(String[] args) {
        int n = 7;
        int stars = n/2;
        int space = 1;
        int rows = 1;
        while(rows <= n){
            int i = 1;
            while(i <= stars){
                System.out.print("* ");
                i++;
            }
            int j = 1;
            while(j <= space ){
                System.out.print("  ");
                j++;
            }
            int k = 1;
            while(k<=stars){
                System.out.print("* ");
                k++;
            }
            if(rows >= ((n/2)+1)){
                stars++;
                space-=2;
            }else{
                stars--;
                space+=2;
            }
            rows++;
            System.out.println();
        }
    }
}
