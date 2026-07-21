package recursion.Lvl1;

public class question1 {
    public static void main(String[] args) {
        // print all the integers from n to 1
        helper(5);
    }
    static void helper(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        helper(n-1);
    }
}
