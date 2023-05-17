package Lec25;

public class LexicoGraphical_Counting {
    public static void main(String[] args) {
        int n = 1000;
        lexicoCounting(n ,0);
    }

    private static void lexicoCounting(int n,int ans) {
        if(ans>n){
            return;
        }
        System.out.println(ans);
        int i = 0;
        if(ans==0){
            i = 1;
        }

        for(;i<10;i++){
            lexicoCounting(n,ans*10+i);
        }
    }
}
