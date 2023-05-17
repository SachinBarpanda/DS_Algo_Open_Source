package Lec18;

import java.util.Scanner;

public class Kartik_Bhaiya_And_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String str =sc.next();
        int a = flipchar(str,k,'a');
        int b = flipchar(str,k,'b');
        System.out.println(Math.max(a,b));
    }

    private static int flipchar(String str, int flip ,char ch) {
        int start = 0;
        int end = 0;
        int ans = 0;
        int k = 0;
        while(end<str.length()) {
            //increase the value
            if(str.charAt(end)==ch){
                k++;
            }

            //check value to decrease flip
            //increase start
            while(k>flip && start<=end){
                if(str.charAt(start)==ch){
                    k--;
                }
                start++;
            }

            //record the ans
            ans = Math.max(ans,end-start+1);
            end++;
        }
        return ans;
    }
}
