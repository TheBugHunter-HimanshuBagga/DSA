package recursion.Lvl1;

public class question6 {
    public static void main(String[] args) {
        // sum of the digits
        // 1342 -> 1+3+4+2 = 10
        System.out.println(helperRecurssion(1342));
    }
    static int helperRecurssion(int n){
        if(n == 0){
            return 0; // base condition
        }
        int lastDigit = n%10; // remainder 1342%10 = 134.2 -> 2
        int remainingDigits = n/10; // remaining -> 1342/10 = 134
        System.out.println(remainingDigits);
        return lastDigit + helperRecurssion(remainingDigits);
    }
}
