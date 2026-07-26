package recursion.String;

public class q2 {
    public static void main(String[] args) {
        // find the subsets
        helperSubset("", "abc");
    }
    static void helperSubset(String processed, String unProcessed){
        if(unProcessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unProcessed.charAt(0);

        // make 2 recursion calls either ass it or remove it
        helperSubset(processed + ch, unProcessed.substring(1));
        helperSubset(processed, unProcessed.substring(1));
    }
}
