package Lec24;

import java.util.Scanner;

public class Permutation_Using_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str="abc";
        premutationRecursion(str,"");
    }

    private static void premutationRecursion(String str,String ans) {
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i = 0 ; i < str.length();i++){
            char ch = str.charAt(i);
            String prev = str.substring(0,i);
            String next = str.substring(i+1);
            premutationRecursion(prev+next,ans+ch);
        }
    }
}
