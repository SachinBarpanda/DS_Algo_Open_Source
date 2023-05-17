package Lec7;

public class Deci_to_Bin {
    public static void main(String[] args) {
        int n = 37;
        int sum = 0;
        int mul = 1;
        while(n>0){
            int rem = n%2;
            n/=2;
            sum +=rem*mul;
            mul *=10;
        }
        System.out.println(sum);
    }
}
