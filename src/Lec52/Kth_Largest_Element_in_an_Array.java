package Lec52;

import java.util.Collections;
import java.util.PriorityQueue;

public class Kth_Largest_Element_in_an_Array {
    public static void main(String[] args) {
        int[] arr = {3,2,3,1,2,4,5,5,6};
        int k = 4;
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int a = findKthLargest(arr,k);
        System.out.println(a);
    }
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for (int i = 0; i < k ; i++) {
            p.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > p.peek()){
                p.remove();
                p.add(nums[i]);
            }
        }
        return p.peek();
        
    }
}
