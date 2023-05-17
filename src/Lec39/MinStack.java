package Lec39;

import java.util.Stack;

public class MinStack {
    static int[] arr = {5,7,2,9,4,3,8,1,17};
    static Stack<Integer> st = new Stack<>();
    static int min = 0;
    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            push(arr[i]);
        }
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(min+"Min");
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(min+"Min");
    }
    public static void push(int item){
        int i = 0;
        if(st.isEmpty()){
            min = item;
            st.push(item);
        }else if(item > min){
            st.push(item);
        }else{
            int encrypt = item - min;
            st.push(encrypt);
            min = item;
        }
    }
    public static int pop(){
        int a = st.pop();
        if(a>min){
            return a ;
        }
        else{
            int b = min ;
            int decrypt = min + ((-1) * a);
            min = decrypt;
            return b;
        }
    }
}
