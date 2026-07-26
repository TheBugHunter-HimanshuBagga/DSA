package recursion.PatternPrinting;

public class pattern1 {
    public static void main(String[] args) {
//        for(int row = 4; row >= 1; row--){
//            for(int col = 1; col <= row ; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        helperPattern1(4, 0);

    }

    static void helperPattern1(int row, int column){
        if(row == 0){
            return;
        }
        if(column < row){
            System.out.print("* ");
            helperPattern1(row, column+1);
        }else{
            System.out.println();
            helperPattern1(row-1, 0);
        }
    }
}

/*
print this
 * * * *
 * * *
 * *
 *

 with and without recursion

 */
