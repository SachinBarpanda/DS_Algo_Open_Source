package Lec26;

import Lec21.Print_Dec;

public class Coin_Permutation {
    public static void main(String[] args) {
        int coin[] = {2,3,5,6};
        int amount = 10;
        coinPermutation(coin,amount,"");
    }
    public static void coinPermutation(int [] arr,int sum, String ans){
        if(sum==0){
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if(sum>=arr[i]){
                coinPermutation(arr,sum-arr[i],ans+arr[i]);
            }
        }
    }
}
