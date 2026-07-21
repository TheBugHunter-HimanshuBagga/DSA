package recursion.Lvl1;

public class question4 {
    public static void main(String[] args) {
        // print 5432112345
        helper1(5);
        helper2(5);
    }
    static void helper1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        helper1(n-1);
    }
    static void helper2(int n){
        if(n==0){
            return;
        }
        helper2(n-1);
        System.out.println(n);

    }

}
