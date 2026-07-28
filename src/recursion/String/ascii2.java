package recursion.String;

import java.util.ArrayList;

public class ascii2 {
    public static void main(String[] args) {
        System.out.println(helperAscii("", "abc", new ArrayList<>()));
    }
    static ArrayList<String> helperAscii(String p, String up, ArrayList<String> list){
        if(up.isEmpty()){
            list.add(p); // returns a boolean
            return list;
        }
        char ch = up.charAt(0);

        // 2 cases take or drop + 1 ascii
        helperAscii(p + ch, up.substring(1), list); // take
        helperAscii(p + (ch + 0), up.substring(1), list); // take
        helperAscii(p, up.substring(1), list); // leave

        return list;
    }
}
