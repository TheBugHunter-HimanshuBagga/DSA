package recursion.Lvl1;

public class question2 {
    public static void main(String[] args) {
        // from 1 to n
        helper(1, 76);
    }
    static void helper(int n, int target){
        if(n == target + 1){
            return;
        }
        System.out.println(n);
        helper(n+1, target);
    }
}
