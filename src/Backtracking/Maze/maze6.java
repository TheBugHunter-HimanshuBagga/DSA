package Backtracking.Maze;

public class maze6 {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        helper(0,0,"",maze);
    }
    static void helper(int row, int column, String path, boolean[][] maze){
        if(row == maze.length - 1 && column == maze[0].length - 1){
            System.out.println(path);
            return;
        }
        if(!maze[row][column]){ // false
            return;
        }
        // if its valid then block it
        maze[row][column] = false;
        // visit all the direction DOWN, UP, LEFT, RIGHT
        if(row < maze.length - 1){
            helper(row + 1, column , path + "D", maze);
        }
        if(column < maze[0].length - 1){
            helper(row, column + 1, path + "R", maze);
        }
        if(row > 0){
            helper(row - 1, column, path + "U", maze);
        }
        if(column > 0){
            helper(row, column - 1, path + "L", maze);
        }

        maze[row][column] = true;
    }
}
