package Lec22;

public class Subsequence_of_String {
    //substring which is not continuous
    public static void main(String[] args) {
        String str = "abc";
        findSubsequence(str,"");
    }

    private static void findSubsequence(String ques, String ans) {
        if(ques.length() == 0){
            System.out.println(ans);
            return ;
        }

        char ch = ques.charAt(0);
        findSubsequence(ques.substring(1),ans);
        findSubsequence(ques.substring(1),ans+ch);
    }
}
