package arrays.Without2Pointers;

public class PalindromeCheck {
    public static void main(String[] args) {
        String s = "madam";
        String reverse = "";
        for(int i = s.length() - 1 ; i >= 0 ; i--){
            reverse += s.charAt(i);
        }

        if(s.equals(reverse)){
            System.out.println("It is");
        }
        else{
            System.out.println("Is not");
        }
    }
}
