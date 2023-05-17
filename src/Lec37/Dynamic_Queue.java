package Lec37;

import Lec35.Queue;

public class Dynamic_Queue extends Queue {
    @Override
    public void EnQueue(int item ) throws Exception {
        if(isFull()){
            int[] newarr = new int[2*arr.length];
            for (int i = 0; i < size; i++) {
                int idx = (front+i) % arr.length;
                newarr[i] = arr[idx];
            }
            arr= newarr;
            front = 0;
        }
        super.EnQueue(item);
    }
}
