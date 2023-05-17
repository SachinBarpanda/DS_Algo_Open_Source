package Lec48;

public interface StackI {
    int val = 90;
    void push(int item);
    int pop();
    int peek();
    default int fun(){
        System.out.println(fun3());
        return 9;
    }
    static int fun2(){
        System.out.println("static mehtod hai");

        return 0;
    }
    private int fun3(){
        return 9;
    }
}
