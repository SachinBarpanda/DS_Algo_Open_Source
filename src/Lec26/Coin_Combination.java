package Lec26;

public class Coin_Combination {
    public static void main(String[] args) {
        int coin[] = {2,3,5,6};
        int amount = 10;
        coinCombination(coin,amount,0,"",0);

    }
    public static void coinCombination(int [] coin , int ta,int sum, String ans, int curr){
        if(sum == ta){
            System.out.println(ans);
            return;
        }
        if(sum>ta){
            return;
        }
        for(int i = curr;  i< coin.length;i++){
            coinCombination(coin,ta,sum+coin[i],ans+" "+coin[i],i);
        }
    }
}
