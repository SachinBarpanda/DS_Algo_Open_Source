package Lec26;


public class Queen_Combination {
    public static void main(String[] args) {
        int tq = 2;
        int n = 4;
        boolean [] board = new boolean[n];
        queenCombination(board,tq,0,"",0);
    }

    private static void queenCombination(boolean[] board, int tq,int qpsf,String ans,int next) {
        if (qpsf == tq) {
            System.out.println(ans);
            return;
        }

        for(int i = next ; i <board.length; i++){
            if(!board[i]){
                board[i] = true;
                queenCombination(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf,i+1);
                board[i] = false;
            }
        }
    }
}
