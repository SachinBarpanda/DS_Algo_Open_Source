package Lec13;

public class First_Bad_Version {
    public static void main(String[] args) {

    }
}
 class Solution  {
    public int firstBadVersion(int n) {
        long low = 1;
        long high = n;
        int ans = -1;
        while(low<=high){
            long mid = (low+high)/2;
            int mid1 = (int)mid;
            if(isBadVersion(mid1)){
                ans = mid1;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    private boolean isBadVersion(int mid1) {
        return true;
    }

}