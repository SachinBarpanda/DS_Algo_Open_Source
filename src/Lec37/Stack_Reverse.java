package Lec37;

import java.util.Stack;

import static Lec37.Put_InDown_Element.InsertDown;


public class Stack_Reverse {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(40);
        st.push(6);
        st.push(89);
        st.push(70);
        st.push(-2);
        System.out.println(st);
        Reverse(st);
        System.out.println(st);
    }
    public static void Reverse(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int item = st.pop();
        Reverse(st);
        InsertDown(st,item);
    }
}
