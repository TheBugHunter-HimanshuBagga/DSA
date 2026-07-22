package recursion.Lvl1;

public class question9 {
    public static void main(String[] args) {
        // count number of zeros
        System.out.println(helperCountZERO(10300));
    }
    static int helperCountZERO(int n){
        if(n == 0){
            return 0;
        }
        int lastDigit = n % 10; //remainded
        int remainingDigits = n/10;
        if(lastDigit == 0){
            return 1 + helperCountZERO(remainingDigits);
        }
        return helperCountZERO(remainingDigits);
    }
}
