package Lec17;

import java.util.Scanner;

public class Playing_with_Good_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(Good_Strings(str));
    }
    public static int Good_Strings(String str){
        int count = 0;
        int ans = 0;
        for(int i = 0 ; i <str.length();i++){
            char ch = str.charAt(i);
            if(isVowels(ch)){
                count = 0;
                while(i<str.length() && isVowels(str.charAt(i))){
                    count++;
                    i++;
                }
                ans = Math.max(ans,count);
            }
        }
        return ans;
    }
    public static boolean isVowels (char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
}
