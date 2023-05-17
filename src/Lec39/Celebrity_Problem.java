package Lec39;

import java.util.Scanner;
import java.util.Stack;

public class Celebrity_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[][] arr = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(celebrity(arr));
    }
    public static String celebrity(int[][] arr) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            st.push(i);
        }
        while (st.size() > 1) {
            int a = st.pop();
            int b = st.pop();
            if (arr[a][b] == 1) {
                st.push(b);
            } else {
                st.push(a);
            }
        }
        int a = st.pop();
        for (int i = 0; i < arr[0].length; i++) {
            if (arr[a][i] != 0) {
                return "No Celebrity";
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i != a) {
                if (arr[i][a] != 1) {
                    return "No Celebrity";
                }
            }
        }
        return a + "";
    }
}