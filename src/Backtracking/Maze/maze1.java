package Backtracking.Maze;

public class maze1 {
    public static void main(String[] args) {
        System.out.println(paths(3, 3));
    }
    static int paths(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int right = paths(r, c - 1); // since column is used up hence c - 1
        int down = paths(r - 1, c); // since row is used up hence r - 1

        return right + down;
    }
}
