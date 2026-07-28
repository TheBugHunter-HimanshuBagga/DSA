package iterative;

public class reverseString {
    public static void main(String[] args) {
        String str = "abcdde";
        helper(str);
    }
    static void helper(String str){
        if(str.length() == 0){
            return;
        }
        char ch = str.charAt(str.length() - 1);
        System.out.print(ch);

        String remaining = str.substring(0, str.length() - 1);
        helper(remaining);
    }
}
