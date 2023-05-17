package Lec52;

import java.util.PriorityQueue;

public class Merge_Rope {
    public static void main(String[] args) {
        int[] arr ={2,1,3,4};
        System.out.println(minCost(arr));
    }
    public static int minCost(int [] arr){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0 ; i < arr.length;i++){
            pq.add(arr[i]);
        }
        int cost = 0;
        while(pq.size()>1){
            int a = pq.poll();
            int b = pq.poll();
            a+=b;
            cost+=a;
            pq.add(a);
        }
        return cost;
    }
}
