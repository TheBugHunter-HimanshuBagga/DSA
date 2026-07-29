package recursion;

public class reverseCharacters {
    public static void main(String[] args) {
        // reverse
        char[] ch = {'h','e','l','l','o'};
        helper(ch, ch.length - 1);
    }
    static void helper(char[] ch, int index){
        if(index < 0){
            return;
        }
        System.out.print(ch[index]);
        helper(ch, index - 1);
    }
}
