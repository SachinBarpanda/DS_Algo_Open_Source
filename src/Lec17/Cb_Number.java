package Lec17;

import java.util.Scanner;

public class Cb_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int ans = cbNum(s);
        System.out.println(ans);
    }

    private static int cbNum(String s) {
        int count = 0;
        boolean[] bs = new boolean[s.length()];
        for(int k = 0; k <s.length();k++){
            bs[k] = false;
        }
        for(int len = 1 ; len <= s.length();len++){
            for(int j = len ; j <=s.length();j++){
                int i = j - len;
                String str = s.substring(i,j);
                if(!isVisited(bs,i,j-1)){
                    if(cbOrNot(str)){
                        for(int k = i; k <j;k++){
                            bs[k] = true;
                        }
                        count++;
                    }
                }
            }
        }
        return count;
    }
    private static boolean isVisited(boolean[] vis , int i , int j ){
        for(;i<=j;i++){
            if(vis[i]){
                return true;
            }
        }
        return false;
    }

    private static boolean cbOrNot(String i){
            if(i.equals("0")||i.equals("1")){
                return false;
            }
            int [] n = {2,3,5,7,11,13,17,19,23,29};
            for(int k : n) {
                if (i.equals(Integer.toString(k))){
                    return true;
                }
            }
            for(int k : n ){
                long x = Long.parseLong(i);
                if(x%k==0){
                    return false;
                }
            }

        return true;
    }
}
