package Lec37;

import Lec35.Queue;

public class Dynamic_Queue_Client  {
    public static void main(String[] args) throws Exception {
        Dynamic_Queue dq = new Dynamic_Queue();
        dq.EnQueue(10);
        dq.EnQueue(20);
        dq.EnQueue(30);
        dq.EnQueue(40);
        dq.EnQueue(50);
        System.out.println(dq.DeQueue());
        System.out.println(dq.DeQueue());
        dq.EnQueue(60);
        dq.Display();
        System.out.println();
        dq.EnQueue(70);
        dq.EnQueue(80);
        dq.Display();

    }


}
