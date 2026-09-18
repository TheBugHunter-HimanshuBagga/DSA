package arrays.TwoPOINTERS;

public class drill5 {
    public static void main(String[] args) {
        // check if palindrome or not
        String s = "madam";
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                System.out.println(s + " is not a palindrome.");
                break;
            }
            else{
                left++;
                right--;
            }
        }
    }
}
