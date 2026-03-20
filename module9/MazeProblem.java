package com.tripillar_coding_assignment.module9;

public class MazeProblem {
    public static void main(String[] args) {
        int[][] solution = new int[n][n]; // Initialize empty path
        if (solveMaze(0, 0, solution)) {
            printSolution(solution);
        } else {
            System.out.println("No solution exists");
        }
    }
    static int[][] maze={{1,0,0,0},
                        {1,1,0,1},
                        {0,1,0,0},
                        {1,1,1,1}};
    static int n=maze.length;
    static boolean solveMaze(int x,int y,int[][] solution){
        if(x == n-1 && y==n-1 && maze[x][y]==1){
            solution[x][y]=1;
            return true;
        };
        if(isSafe(x,y)){
            solution[x][y]=1;
            if(solveMaze(x+1,y,solution)) return true;
            if(solveMaze(x,y+1,solution)) return true;
            solution[x][y]=0;
            return false;
        }
        return false;
    }
    static boolean isSafe(int x,int y){
        return (x>=0 && x<n &&y>=0&&y<n&&maze[x][y]==1);
    }
    static void printSolution(int[][] solution){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" "+solution[i][j]+" ");
            }
            System.out.println();
        }
    }
}
