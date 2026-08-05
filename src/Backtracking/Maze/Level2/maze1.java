package Backtracking.Maze.Level2;

import java.util.Arrays;

public class maze1 {
    public static void main(String[] args) {
        // print path Matrix + direction in which they visited
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        // start 0,0 -> 2,2
        int[][] steps = new int[maze.length][maze[0].length];
        helper(0,0,"",maze, steps, 1);
    }
    static void helper(int row, int column, String path, boolean[][] maze, int[][] steps, int step){
        if(row == maze.length - 1 && column == maze[0].length - 1){
            // store the final step
            steps[row][column] = step;
            // step matrix
            for(int[] x: steps){
                System.out.println(Arrays.toString(x));
            }
            // Path print
            System.out.println(path);
            System.out.println();
            return;
        }

        if(!maze[row][column]){ // if the pace is available or not
            return; // if not return
        }

        // if available then capture that
        maze[row][column] = false;
        // then i will mark it as my first step here
        steps[row][column] = step;

        // explore the directions
        if(row < maze.length - 1){
            helper(row + 1, column, path + "D", maze, steps, step + 1);
        }
        if(column < maze[0].length - 1){
            helper(row,column + 1, path + "R", maze , steps, step + 1);
        }
        if(row > 0){
            helper(row - 1, column, path + "U", maze, steps ,step + 1);
        }
        if(column > 0){
            helper(row, column - 1, path + "L", maze, steps, step + 1);
        }

        maze[row][column] = true;
        steps[row][column] = 0;
    }
}
