package recursion.PatternPrinting;

public class pattern2 {
    public static void main(String[] args) {
        helperPattern2(4, 0);
    }
    static void helperPattern2(int row, int column){
        if(row == 0){
            return;
        }
        if(column < row){
            helperPattern2(row, column+1);
            System.out.print("* ");
        }else{
            helperPattern2(row-1, 0);
            System.out.println();
        }
    }
}
/*
 *
 * *
 * * *
 * * * *
 */
