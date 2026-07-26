package recursion.String;

import java.util.ArrayList;

public class q3 {
    public static void main(String[] args) {
        System.out.println(helperSubsets("", "abc", new ArrayList<>()));
    }
    static ArrayList<String> helperSubsets(String p , String up, ArrayList<String> list){
        if(up.isEmpty()){
            list.add(p); // returns boolean but we need an ArrayList to return
            return list;
        }
        char ch = up.charAt(0);
        helperSubsets(p + ch, up.substring(1), list);
        helperSubsets(p, up.substring(1), list);
        return list;
    }
}
