package Backtracking.Maze;

public class maze2 {
    public static void main(String[] args) {
        // print all paths from source to destination
        helperPrint(7,3,"");
    }
    static void helperPrint(int r, int c, String path){
        if(r == 1){
            System.out.println(path + "R".repeat(c - 1));
            return;
        }
        if(c == 1){
            System.out.println(path + "D".repeat(r - 1));
            return;
        }
        helperPrint(r, c - 1, path + "R");
        helperPrint(r - 1, c , path + "D");
    }
}
