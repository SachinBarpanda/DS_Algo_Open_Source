package Lec32;

public class Prime_Sieve {
    public static void main(String[] args) {
        int n = 100;
        printPrime(n);
    }
    public static void printPrime(int n ){
        boolean [] prime = new boolean[n+1];
        prime[0] = true;
        prime[1] = true;
        for (int i = 2; i*i<=n; i++) {
            if(!prime[i]){
                for(int mul = 2; i*mul<=n;mul++){
                    prime[mul*i] = true;
                }
            }
        }
        for(int i = 0; i < prime.length;i++){
            if(!prime[i]){
                System.out.println(i+" ");
            }
        }
    }
}
