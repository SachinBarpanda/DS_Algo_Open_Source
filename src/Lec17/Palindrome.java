package Lec17;

public class Palindrome {
    public static void main(String[] args) {
        String str = "NITINA";
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String str){
        int i = 0 ;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}
