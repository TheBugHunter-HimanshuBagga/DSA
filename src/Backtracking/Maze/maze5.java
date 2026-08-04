package Backtracking.Maze;

public class maze5 {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        helper(3,3,maze, "");
    }
    static void helper(int row, int column, boolean[][] maze, String path){
        if(row == 1 && column == 1){
            System.out.println(path);
            return;
        }
        int currentRow =  maze.length - row ;
        int currentColumn = maze[0].length - column;
        if(!maze[currentRow][currentColumn]){ // false then return to the previous call
            return;
        }
        if(row > 1){
            helper(row - 1, column, maze, path + "D");
        }
        if(column > 1){
            helper(row, column - 1, maze, path + "R");
        }
    }
}
