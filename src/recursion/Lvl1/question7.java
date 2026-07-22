package recursion.Lvl1;

public class question7 {
    public static void main(String[] args) {
        // reverse a number n = 1824 -> 4281
        helperReverse(1824);
    }
    static void helperReverse(int n){
        if(n == 0){
            return;
        }
        int lastDigit = n % 10;
        System.out.print(lastDigit + " ");
        int remainingDigit = n/10;
        helperReverse(remainingDigit);
    }
}
