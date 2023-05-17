package Lec22;

public class FindTheIndex {
    public static void main(String[] args) {
        int [] arr = {2,3,4,2,3,5,7,3};
        int item = 5;
        System.out.println(findIndex(arr,item,0));
    }
    public static int findIndex(int [] arr, int item ,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i] == item){
            return i;
        }
        return findIndex(arr,item,i+1);
    }
}
