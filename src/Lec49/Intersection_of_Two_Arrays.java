package Lec49;

import java.util.*;

public class Intersection_of_Two_Arrays {
    public static void main(String[] args) {
//        int[] arr1 = {1,2,2,1};
//        int[] arr2 = {2,2};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr1 = new int[n];
        int[]arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        int[]arr3 =  intersection(arr1,arr2);
        Arrays.sort(arr3);
        System.out.println((Arrays.toString(arr3)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < nums1.length;i++){
            if(map.containsKey(nums1[i])){
                int val = map.get(nums1[i]);
                map.put(nums1[i],val+1);
            }else{
                map.put(nums1[i],1);
            }
        }
        for(int i = 0 ;i < nums2.length;i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
                list.add(nums2[i]);
                int val = map.get(nums2[i]);
                map.put(nums2[i],val-1);
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
