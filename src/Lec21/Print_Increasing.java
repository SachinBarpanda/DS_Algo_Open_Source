package Lec21;

public class Print_Increasing {
    public static void main(String[] args) {
        int n = 5;
        PI(n);
    }

    private static void PI(int n) {
        if(n==0){
            return ;
        }
        PI(n-1);
        System.out.println(n);
    }
}
