package Lec24;

public class MazePath {
    public static int count = 0 ;
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        printPath(0,0,n-1,m-1,"");
        System.out.println(count);
    }
    public static void printPath(int thisRow, int thisCol,int endRow, int endCol, String ans){
        if(thisRow==endRow && thisCol == endCol){
            System.out.println(ans);
            count++;
            return;
        }
        if(thisRow > endRow || thisCol > endCol){
            return;
        }

        printPath(thisRow,thisCol+1,endRow,endCol,ans+"H");
        printPath(thisRow+1,thisCol,endRow,endCol,ans+"V");
    }
}
