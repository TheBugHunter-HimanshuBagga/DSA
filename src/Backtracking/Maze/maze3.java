package Backtracking.Maze;

public class maze3 {
    public static void main(String[] args) {
        helperDiagonal(3 ,3, "");
    }
    static void helperDiagonal(int row, int column , String path){

        if(row == 1){
            System.out.println(path + "R".repeat(column - 1));
            return;
        }
        if(column == 1){
            System.out.println(path + "D".repeat(row - 1));
            return;
        }
        //  right
        helperDiagonal(row, column - 1, path + "R");
        // diagonal
        helperDiagonal(row  - 1, column - 1 , path + "X");
        // down
        helperDiagonal(row - 1 , column , path + "D");
    }
}
