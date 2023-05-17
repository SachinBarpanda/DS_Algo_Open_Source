package Lec35;

public class Queue {
    protected int size ;
    protected int front;
    protected int[] arr ;

    public Queue() {
        this.size = 0;
        this.front = 0;
        this.arr = new int[5];
    }

    public Queue(int cap) {
        this.size = 0;
        this.front = 0;
        this.arr = new int[5];
    }

    public boolean isEmpty(){return size==0;}
    public boolean isFull(){return size == arr.length;}
    public int size(){return size;}

    public void EnQueue(int item )throws Exception{
        if(isFull()){
            throw new Exception("Boka Queue full");
        }
        arr[(front+size)%arr.length] = item;
        size++;
    }

    public int DeQueue()throws Exception{
        if(isEmpty()){
            throw new Exception("Boka Queue Khali");
        }
        int val = arr[front];
        front=(front+1)%arr.length;
        size--;
        return val;
    }

    public int getFront()throws Exception{
        if(isEmpty()){
            throw new Exception("Boka Queue Khali");
        }
        return arr[front];
    }

    public void Display(){
        for(int i = 0;i<size ;i++){
            int idx = (i+front) % arr.length;
            System.out.print(arr[idx]+" ");
        }
    }


}
