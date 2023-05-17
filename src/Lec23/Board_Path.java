package Lec23;

public class Board_Path {
    public static void main(String[] args) {
        int n = 4;
        boardPath(0,n,"");
//        System.out.println(boardPathCount(0,n,""));
        canUseForBoardPath(0,n,"");
    }

    private static void boardPath(int curr ,int n, String str) {
        if(curr == n){
            System.out.println(str);
            return;
        }
        if(curr>n){
            return;
        }
        boardPath(curr+1,n,str+1);
        boardPath(curr+2,n,str+2);
        boardPath(curr+3,n,str+3);
    }
    private static int boardPathCount(int curr, int n , String str){
        if(curr == n){
            return 1;
        }
        if(curr>n){
            return 0;
        }
        int a = boardPathCount(curr+1,n,str+1);
        int b = boardPathCount(curr+2,n,str+2);
        int c = boardPathCount(curr+3,n,str+3);
        return a+b+c;
    }
    private static int canUseForBoardPath(int curr,int n , String str){
        if(curr == n){
            System.out.println(str);
            return 1;
        }
        if(curr>n){
            return 0;
        }
        int a = 0;
        for(int dice = 1 ; dice <=3;dice++) {
            a+=canUseForBoardPath(curr + dice, n, str + dice);
        }
        return a;
    }

}
