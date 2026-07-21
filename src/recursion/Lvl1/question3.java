package recursion.Lvl1;

public class question3 {
    public static void main(String[] args) {
        helper(1,9);
    } // 1,2,3,4,5,6,7,8,9
    static void helper(int n, int target){
        if(n == target + 1) {
            return;
        }
        helper(n+1, target);
        System.out.println(n);
    }
}
