package Lec37;

public class Stack_Push_Efficient {
    private Dynamic_Queue dq = new Dynamic_Queue();
    public boolean isEmpty(){
        return dq.isEmpty();
    }
    public void push(int item) throws Exception {
        dq.EnQueue(item);
    }
    public int size(){
        return dq.size();
    }
    public int pop() throws Exception {
        Dynamic_Queue helper = new Dynamic_Queue();
        while(dq.size()>1){
            helper.EnQueue(dq.DeQueue());
        }
        int item = dq.DeQueue();
        dq = helper;
        return item;//O(n)
    }
    public int peek() throws Exception{
        Dynamic_Queue helper = new Dynamic_Queue();
        while(dq.size()>1){
            helper.EnQueue(dq.DeQueue());
        }
        int item = dq.DeQueue();
        helper.EnQueue(item);
        dq = helper;
        return item;//O(n)
    }

    public static void main(String[] args) throws Exception {
        Stack_Push_Efficient spf = new Stack_Push_Efficient();
        spf.push(10);
        spf.push(20);
        spf.push(30);
        spf.push(40);
        spf.push(50);
        System.out.println(spf.pop());
        System.out.println(spf.peek());
        //spf.push(-50);
        System.out.println(spf.peek());

    }
}
