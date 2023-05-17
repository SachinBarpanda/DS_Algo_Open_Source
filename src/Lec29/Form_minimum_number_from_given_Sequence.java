package Lec29;

import java.util.Scanner;

public class Form_minimum_number_from_given_Sequence{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        formNumber(str);
    }
    public static void formNumber(String str){
        int[]arr = new int[str.length()+1];
        int count = 1;
        for (int i = 0; i <= str.length(); i++) {
            if(i==str.length() || str.charAt(i)=='I') {
                arr[i] = count;
                count++;
                for (int j = i-1; j >=0 && str.charAt(j)=='D' ; j--) {
                    arr[j] = count;
                    count++;
                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
