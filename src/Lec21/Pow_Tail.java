package Lec21;

public class Pow_Tail {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        int ans = powTail(a,b,1);
        System.out.println(ans);
    }

    private static int powTail(int a, int b, int ans) {
        if(b==0){
            return ans;
        }
        ans *= a ;
        return powTail(a,b-1,ans);

    }
}
