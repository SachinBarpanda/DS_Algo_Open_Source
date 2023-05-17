package Lec3;

public class Pattern_16 {
    public static void main(String[] args) {
        int n = 5;
        int space = n-1;
        int star = n;
        int rows = 1;
        while(rows <= (2*n)-1){
            int i = 1 ;
            while(i <= space){
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while(j <= star){
                System.out.print("* ");
                j++;
            }
            if(rows<n){
                space--;
                star--;
            }else{
                space++;
                star++;
            }
            rows++;
            System.out.println();
        }
    }
}
