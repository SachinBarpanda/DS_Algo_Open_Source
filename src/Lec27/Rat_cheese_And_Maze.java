package Lec27;

import java.util.Scanner;

public class Rat_cheese_And_Maze {
    public static boolean f = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] c = new char[n][m];
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            for (int j = 0; j < m; j++) {
                c[i][j] = str.charAt(j);
            }
        }
        int [] [] ans = new int[n][m];
        ratInMaze(c,0,0,ans);
        if(!f){
            System.out.println("NO PATH FOUND");
        }
    }
    public static void ratInMaze(char[][] maze, int cc,int cr,int[][]ans){
        if(cr==maze.length-1 && cc==maze[0].length-1 && maze[cr][cc]!='X'){
            ans[cr][cc] = 1;
            Display(ans);
            System.out.println();
            f =true;
            return;
        }

        if(cc<0||cr<0 || cc>=maze[0].length || cr>=maze.length || maze[cr][cc]=='X'){
            return;
        }
        maze[cr][cc] = 'X';
        ans[cr][cc] = 1;

        ratInMaze(maze,cc,cr-1,ans);
        ratInMaze(maze,cc,cr+1,ans);
        ratInMaze(maze,cc-1,cr,ans);
        ratInMaze(maze,cc+1,cr,ans);

        maze[cr][cc] = 'O';
        ans[cr][cc] = 0;
    }
    public static void Display(int [] [] ans){
        for (int i = 0; i <ans.length ; i++) {
            for(int j = 0 ;  j < ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
