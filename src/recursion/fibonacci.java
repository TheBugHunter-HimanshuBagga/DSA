package recursion;

public class fibonacci {
    public static void main(String[] args) {
        int ans = helper(50);
        System.out.println(ans);
    }
    static int helper(int n){
        if(n < 2){
            return n;
        }

        return  helper(n-1) + helper(n-2);
    }
}
