package recursion;

public class subsets {
    public static void main(String[] args) {

        helperSubsets("", "abc");
    }
    static void helperSubsets(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.print(processed + " ");
            return;
        }
        char ch = unprocessed.charAt(0);
        helperSubsets(processed+ch, unprocessed.substring(1));
        helperSubsets(processed, unprocessed.substring(1));
    }
}
