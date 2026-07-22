package recursion.Lvl1;

public class question10 {
    public static void main(String[] args) {
        // reduce number to 0
        System.out.println(helperReduceToZero(14,0));
    }
    static int helperReduceToZero(int n, int count){
        if(n == 0){
            return count;
        }
        if(n % 2 == 0){ // even
            return helperReduceToZero(n/2, count+1);
        }else{
            return helperReduceToZero(n-1, count + 1);
        }
    }
}
