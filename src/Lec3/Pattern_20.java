package Lec3;

public class Pattern_20 {
    public static void main(String[] args) {
        int n = 7;
        int rows = 1;
        int starPos = 1;
        while(rows <= n ){
            int i = 1 ;
            while(i <= n){
                if(i == (n/2+1)-(starPos-1) || i == (n/2+1)+(starPos-1) ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                i++;
            }
            if(rows<=n/2){
                starPos++;
            }else{
                starPos--;
            }
            rows++;
            System.out.println();
        }
    }
}
