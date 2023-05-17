package Lec39;

import java.util.Stack;

public class Largest_Rectangle {
    public static void main(String[] args) {
        int [] arr = {2,3,4};
        System.out.println(largestRec(arr));
    }
    public static int largestRec(int [] arr){
        Stack<Integer> st = new Stack<>();
        st.push(0);
        int ei = 0;
        int ans = 0;
        while(ei<arr.length){
            while (!st.isEmpty() && arr[ei] < arr[st.peek()]) {
                int h = st.pop();
                if(st.isEmpty()){
                    int area = arr[h] * (ei);
                    ans = Math.max(area,ans);
                }else{
                    int si = st.peek();
                    int area = arr[h] * (ei-si-1);
                    ans = Math.max(area,ans);
                }
            }
            st.push(ei);
            ei++;
        }
        while (!st.isEmpty()) {
            int h = st.pop();
            if(st.isEmpty()){
                int area = arr[h] * (ei);
                ans = Math.max(area,ans);
            }else{
                int si = st.peek();
                int area = arr[h] * (ei-si-1);
                ans = Math.max(area,ans);
            }
        }
        return ans;
    }
}
