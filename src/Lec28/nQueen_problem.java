package Lec28;

public class nQueen_problem {
    public static void main(String[] args) {
        int n = 4;
        boolean [][] board = new boolean[n][n];
        nQueen(board,0,n);
    }
    public static void nQueen(boolean[][] board, int row , int tq){
        if(tq == 0){
            Display(board);
            System.out.println();
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if(isSafePlace(board,row,col)){
                board[row][col] = true;
                nQueen(board,row+1,tq-1);
                board[row][col] = false;
            }
        }
    }

    private static boolean isSafePlace(boolean[][] board, int row, int col) {
        for (int i = row;i>=0 ;i--) {
            if(board[i][col]){
                return false;
            }
        }
        for (int i = row, j = col; i >=0 &&  j<board.length ; i--,j++) {
            if(board[i][j]){
                return false;
            }
        }
        for (int i = row, j = col; i >=0 &&  j>=0 ; i--,j--) {
            if(board[i][j]){
                return false;
            }
        }
        return true;
    }


    public static void Display(boolean [][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
