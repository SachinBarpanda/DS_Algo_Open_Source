package Lec22;

public class N_coins_Recursion {
    public static void main(String[] args) {
        int n = 3;
        printNCoins(3,"");
    }
    public static void printNCoins(int n , String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }

        printNCoins(n-1,ans+"H");
        printNCoins(n-1,ans+"T");
    }
}
