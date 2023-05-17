package Lec29;

public class Palindromic_Substring {
    public static void main(String[] args) {
        String str = "naman";
    }
    public static int PalindromicCount(String str){
        int count =0 ;
        for(int axis = 0; axis < str.length();axis++){
            for (int orbit = 0; orbit < str.length() && axis- orbit>=0 && axis+orbit <str.length(); orbit++) {
                if(str.charAt(axis-orbit)!=str.charAt(axis+orbit)) {
                    break;
                }
                count++;
            }
        }
//        for(int axis = 0 ; )
        return 0;
    }
}
