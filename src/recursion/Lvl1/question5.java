package recursion.Lvl1;

public class question5 {
    public static void main(String[] args) {
        System.out.println(fiboHelper(5));
    }
    static int fiboHelper(int n){
        if(n == 0){
            return 1;
        }
        return n * fiboHelper(n-1);
    }
}
