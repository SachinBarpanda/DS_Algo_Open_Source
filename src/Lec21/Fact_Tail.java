package Lec21;

public class Fact_Tail {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(5,1));

    }
    public static int fact(int n , int f){
        if(n==0){
            return f;
        }
        f *=n;
        return fact(n-1, f);
    }
}
