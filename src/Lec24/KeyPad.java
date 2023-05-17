package Lec24;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KeyPad {
    public static String [] key = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        List<String> list = new ArrayList<>();
        keyPress(s,"",list);
        for(String s1 : list){
            System.out.print(s1+" ");
        }
        System.out.println();
        System.out.print(count);
    }
    public static void keyPress(String ques, String ans,List<String>list){

        if(ques.length()==0 ){
            list.add(ans);
            count++;
            return;
        }

        char ch = ques.charAt(0);
        String press = key[ch-'0'];
        for(int i = 0 ; i<press.length();i++){
            keyPress(ques.substring(1),ans+press.charAt(i),list);
        }
    }
}
