package Lec23;

public class Count_Of_Subsequence {
    static int count = 0 ;
    public static void main(String[] args) {
        String str = "abc";
        countAns(str,"");
        System.out.println(count);
        System.out.println(countAnsB(str,""));
    }

    private static void countAns(String str, String s) {
        if(str.length() == 0){
            count++;
            return;
        }
        char ch = str.charAt(0);
        countAns(str.substring(1),s);
        countAns(str.substring(1),s+ch);
    }
    private static int countAnsB(String str, String s) {
        if(str.length() == 0){
//            count++;
            return 1;
        }
        char ch = str.charAt(0);
        int a = countAnsB(str.substring(1),s);
        int b = countAnsB(str.substring(1),s+ch);
        return a+b;
    }
}
