package Lec35;

public class Stack {
    protected int[] arr;
    protected int top;
    public Stack(){
        arr = new int[5];
        top = -1;
    }
    public Stack(int cap){
        arr = new int[cap];
        top = -1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==arr.length-1;
    }
    public void push(int item)throws Exception{
        if(isFull()){
            throw new Exception("BKLOL stack full hai");
        }
        top ++;
        arr[top] = item;
    }
    public int pop()throws Exception{
        if(isEmpty()){
            throw new Exception("bklol Nothin to POP");
        }
        int val = arr[top];
        top--;
        return val;
    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Bklol Stack Khali hai");
        }
        int val = arr[top];
        return val;
    }
    public int size(){
        return top+1;
    }
    public void display(){
        for(int i = 0 ; i <= top ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
