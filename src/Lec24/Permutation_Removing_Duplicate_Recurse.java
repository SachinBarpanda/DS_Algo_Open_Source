package Lec24;

public class Permutation_Removing_Duplicate_Recurse {
    public static void main(String[] args) {
        String str = "abca";
        premutationRecurse(str,"");
    }

    private static void premutationRecurse(String str,String ans) {

        if(str.length()==0){
            System.out.println(ans);
            return;
        }


        int[] arr = new int[26];
        for(int i = 0 ; i < str.length();i++){
            char ch = str.charAt(i);
            if(arr[ch-'a'] == 0) {
                arr[(ch-'a')] = 1;
                String prev = str.substring(0, i);
                String next = str.substring(i + 1);
                premutationRecurse(prev + next, ans + ch);
            }
        }
    }
}
