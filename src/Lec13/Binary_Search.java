package Lec13;

public class Binary_Search {
    public static void main(String[] args) {
        int [] arr = {5,3,-7,4,8,2};
        int n = binarySearch(arr,18);
        System.out.println(n);
    }

    private static int binarySearch(int[] arr,int
            item) {
        int si = 0 ;
        int ei = arr.length-1;
        int ans =-1 ;
        while(si<=ei){
            int mid = (si+ei)/2;
            if(arr[mid]>item){
                ei = mid-1;
            }else if(arr[mid] < item){
                si = mid+1;
            }else{
                ans = mid;
                break;
            }
        }
        return ans;
    }
}
