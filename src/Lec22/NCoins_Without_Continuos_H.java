package Lec22;

public class NCoins_Without_Continuos_H {
    public static void main(String[] args) {
        int n = 3;
        ncoindAgain(n,"");
    }

    private static void ncoindAgain(int n,String str) {
        if(n==0){
            System.out.println(str);
            return ;
        }
        if(str.length()==0 || str.charAt(str.length()-1)!='H') {
            ncoindAgain(n - 1, str + "H");
        }
        ncoindAgain(n-1,str+"T");
    }
}
