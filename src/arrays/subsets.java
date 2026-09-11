package arrays;

import java.util.List;

public class subsets {
    public static void main(String[] args){
        helper("" , "123");
    }
    static void helper(String processed, String unProcessed){
        if(unProcessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unProcessed.charAt(0);

        // take
        helper(processed + ch, unProcessed.substring(1));
        // don't take
        helper(processed, unProcessed.substring(1));
    }
}
