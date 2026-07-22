package recursion.Lvl1;

import static java.util.Collections.reverse;

public class question8 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(122210));
    }
    static boolean isPalindrome(int n){
        int reversed = helperReverse(n,0);
        return n == reversed;
    }
    static int helperReverse(int n, int ans){
        if(n == 0){
            return ans;
        }
        int lastDigit = n % 10; // remainder
        ans = ans * 10 + lastDigit;
        int remainingDigit = n / 10;
        return helperReverse(remainingDigit, ans);
    }
}
