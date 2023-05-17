package Lec26;

public class Queen_Permutation {
    public static void main(String[] args) {
        int n = 4;
        int tq = 2;
        boolean [] board = new boolean[n];
        printAnswer(board,tq,0,"");
    }
    public static void printAnswer(boolean[] board, int tq,int qpsf,String ans ){
        if(qpsf==tq){
            System.out.println(ans);
            return;
        }
        for(int i = 0 ; i < board.length;i++){
            if(!board[i]) {
                board[i] = true;
                printAnswer(board, tq, qpsf + 1, ans + "b" + i + "q" + qpsf);
                board[i]=false;
            }
        }
    }
}
