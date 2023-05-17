package Lec23;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public static void main(String[] args) {
        int n = 3;
        List<String> list = new ArrayList<>();
        System.out.println(parenthesisGenerate(n,0,0,"",list));
        System.out.println(list);
    }

    private static List<String> parenthesisGenerate(int n, int open, int close, String str,List<String>list) {
        if(open==n && close==n){
            list.add(str);
            return list;
        }
        if(open<n){
            parenthesisGenerate(n,open+1,close,str+"(",list);
        }
        if(open>close){
            parenthesisGenerate(n,open,close+1,str+")",list);
        }
        return list;
    }
}
