package recursion;

public class iterativeReverseString {
    public static void main(String[] args) {
        // string -> qwerty
        // iterative

        String str = "qwerty";
        while(str.length() > 0){
            char ch = str.charAt(str.length() - 1);
            System.out.print(ch);
            str = str.substring(0, str.length() - 1);
        }
    }
}
