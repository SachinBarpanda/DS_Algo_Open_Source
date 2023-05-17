package Lec49;

import java.util.HashMap;
import java.util.HashSet;

public class Longest_Consecutive_Sequence {
    public static void main(String[] args) {
        int [] arr= {4,0,-4,-2,2,5,2,0,-8,-8,-8,-8,-1,7,4,5,5,-4,6,6,-3};
        System.out.println(longestConsecutive(arr));
    }
    public static int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i]-1)){
                map.put(nums[i],false);
            }
            if(!map.containsKey(nums[i]-1)){
                map.put(nums[i],true);
            }
            if(map.containsKey(nums[i]+1)){
                map.put(nums[i]+1,false);
            }
        }
        int ans = 0;
        int count = 0;
        for(Integer i : map.keySet()){
            if(map.get(i)){
                count = 0;
                int val = i ;
                while(map.containsKey(val)){
                    count++;
                    val++;
                }
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }
}
