package Lec27;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning {
    public static void main(String[] args) {
        String str = "nitin";
        List<String> list = new ArrayList<>();
        List<List<String>> ll = new ArrayList<>();
        partition(str,"",list,ll);
        System.out.println(ll);
    }
    public static void partition(String que, String ans,List<String>list,List<List<String>> ll){
        if(que.length() == 0 ){
//            System.out.println(ans);
            ll.add(new ArrayList<>(list));
            return;
        }
        for(int i = 1; i <= que.length();i++){
            String que1 = que.substring(0,i);
            if(isPalindrome(que1)){
                list.add(que1);
                partition(que.substring(i),ans+que1+"|",list,ll);
                list.remove(list.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String ans){
        int i = 0;
        int j = ans.length()-1;
        while(i<j){
            if(ans.charAt(i)!=ans.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
