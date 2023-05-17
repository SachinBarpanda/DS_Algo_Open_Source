package Lec17;

public class SubString_Print {
    public static void main(String[] args) {
        String str = "NITIN";
        printSubString(str);
    }
    public static void printSubString(String str){
        for(int i = 0 ; i < str.length(); i++){
            for(int j = i+1; j <= str.length();j++){
                String ss = str.substring(i,j);
                if(isPalindrome(ss)) {
                    System.out.println(ss);
                }
            }
        }
    }
    public static boolean isPalindrome(String str){
        int i = 0 ;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
                i++;
                j--;
        }
        return true;
    }
}
