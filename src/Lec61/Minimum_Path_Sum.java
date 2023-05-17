package Lec61;

public class Minimum_Path_Sum {
    public static void main(String[] args) {
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        int [][] dp = new int[grid.length][grid[0].length];
        System.out.println(pathSum(grid,0,0,dp));
    }
    public static int pathSum(int[][] maze , int cc , int cr, int[][]dp){
        if(cc==maze[0].length-1 && cr==maze.length-1){
            return maze[cr][cc];
        }

        if(cc>=maze[0].length || cr>=maze.length ){
            return Integer.MAX_VALUE;
        }

        if(dp[cr][cc] != 0){
            return dp[cr][cc];
        }

        int vertical = pathSum(maze, cc,cr+1,dp);
        int horizontal = pathSum(maze, cc+1,cr,dp);

        return dp[cr][cc] = maze[cr][cc] + Math.min(vertical,horizontal);

    }
}
