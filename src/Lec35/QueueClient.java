package Lec35;

public class QueueClient {
    public static void main(String[] args)throws Exception {
        Queue q = new Queue();
        q.EnQueue(10);
        q.EnQueue(20);
        q.EnQueue(30);
        q.EnQueue(40);
        q.EnQueue(50);
        q.Display();
        System.out.println();
        System.out.println(q.DeQueue());
        System.out.println(q.DeQueue());
        System.out.println(q.DeQueue());
        q.EnQueue(-2);
        q.EnQueue(-3);
        q.EnQueue(-4);
        q.Display();

    }
}
