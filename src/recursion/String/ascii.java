package recursion.String;

public class ascii {
    public static void main(String[] args) {
//        char ch = 'a';
//        System.out.println(ch + 0);
// question: given "ab" print all the possible characters where
        // for each character we can take the character , skip the character , print its ascii value

        helperAscii("", "abc");


    }
    static void helperAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        // 2 choices + 1 ascii choice come in play
        helperAscii(p+ch, up.substring(1));// included
        helperAscii(p + (ch+0)  , up.substring(1)); // (int) ch
        helperAscii(p, up.substring(1)); // excluded
    }
}
