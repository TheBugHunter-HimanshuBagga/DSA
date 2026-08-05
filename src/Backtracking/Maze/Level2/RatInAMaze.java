package Backtracking.Maze.Level2;

public class RatInAMaze {
    static void main(String[] args) {
        int[][] maze = {
                {1, 1, 1, 1},
                {1, 0, 1, 1},
                {1, 1, 1, 0},
                {1, 1, 1, 1}
        };
        // 1 -> open
        // 0 -> closed
        // print all the possible paths from Source to destination
        helper(0,0,maze,"");
    }
    static void helper(int row, int column, int[][] maze, String path){
        if(row == maze.length - 1 && column == maze[0].length - 1){
            System.out.println(path);
            System.out.println();
            return;
        }
        if(maze[row][column] == 0){ // check the availability
            return;
        }
        // now mark it as visited
        maze[row][column] = 0;
        // go different directions
        if(row < maze.length - 1){
            helper(row + 1, column , maze , path + "D");
        }
        if(column < maze[0].length - 1){
            helper(row, column + 1, maze, path + "R");
        }
        if(row > 0){
            helper(row - 1, column, maze , path + "U");
        }
        if(column > 0){
            helper(row, column - 1 , maze, path + "L");
        }
        // UNDO
        maze[row][column] = 1;
    }
}
