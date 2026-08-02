package Backtracking.Maze;

import java.nio.file.Path;
import java.nio.file.Paths;

public class maze4 {
    public static void main(String[] args) {
        // <Maze> with obstacles
        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        helperBackTrack(0,0,"",maze);
    }
    static void helperBackTrack(int row , int column , String path, boolean[][] maze){
        if(!maze[row][column]){ // false
            return;
        }
        if(row == maze.length - 1 && column == maze[0].length - 1){
            System.out.println(path);
            return;
        }
        if(row < maze.length - 1){
            helperBackTrack(row + 1, column, path + "D", maze);
        }
        if(column < maze[0].length - 1){
            helperBackTrack(row, column + 1, path + "R", maze);
        }
    }
}
