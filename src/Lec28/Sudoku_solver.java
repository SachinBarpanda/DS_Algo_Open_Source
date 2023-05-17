package Lec28;

public class Sudoku_solver {
    public static void main(String[] args) {

    }
    public static void sudokuSolver(int[][] grid , int row , int col){
        if (col == 9 ){
            row++;
            col = 0;
        }
        if(row==9){
            Display(grid);
            return;
        }
        
        if(grid[row][col]!=0){
            sudokuSolver(grid,row,col+1);
        }else{
            for(int i = 1; i <= 9 ; i++){
                if(isitSafe(grid,row,col,i)){
                    grid[row][col] = i;
                    sudokuSolver(grid,row,col+1);
                    grid[row][col] = 0;
                }
            }
        }
    }

    private static boolean isitSafe(int[][] grid, int row, int col, int i) {
        return true;
    }

    private static void Display(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
}
