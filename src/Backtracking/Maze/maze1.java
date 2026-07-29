package Backtracking.Maze;

public class maze1 {
    public static void main(String[] args) {
        System.out.println(paths(3, 3));
    }
    static int paths(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int left = paths(r - 1, c);
        int right = paths(r, c - 1);
        //
        return left + right;
    }
}
