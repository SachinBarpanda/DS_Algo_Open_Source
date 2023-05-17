package Lec37;

import java.util.Scanner;

public class Queue_DeQueue_Efficient {
    private Dynamic_Stack st = new Dynamic_Stack();
    public boolean isEmpty(){
        return  st.isEmpty();
    }
    public int size(){
        return st.size();
    }
    public void Enqueue(int item) throws Exception {
        Dynamic_Stack helper = new Dynamic_Stack();
        while(!st.isEmpty()){
            helper.push(st.pop());
        }
        st.push(item);
        while(!helper.isEmpty()){
            st.push(helper.pop());
        }
    }
    public int Dequeue() throws Exception {
        return st.pop();
    }
    public int getFront() throws Exception {
        return st.peek();
    }

    public static void main(String[] args) throws Exception {
        Queue_DeQueue_Efficient qdf = new Queue_DeQueue_Efficient();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 0 ; i< a ; i++){
            qdf.Enqueue(i);
        }
        while(!qdf.isEmpty()){
            System.out.print(qdf.Dequeue()+" ");
        }
//        qdf.Enqueue(10);
//        qdf.Enqueue(20);
//        qdf.Enqueue(30);
//        qdf.Enqueue(40);
//        qdf.Enqueue(50);
//        qdf.Enqueue(60);
//        System.out.println(qdf.Dequeue());
//        System.out.println(qdf.Dequeue());
//        System.out.println(qdf.Dequeue());
//        qdf.Enqueue(70);
//        qdf.Enqueue(80);
//        System.out.println(qdf.Dequeue());
//        System.out.println(qdf.getFront());

    }

}
