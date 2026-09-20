package arrays.TwoPOINTERS;

public class drill11 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 10, 12};
        int target = 7;

        int left = 0;
        int right = 1;
        while(left< right){
            int diffrence = Math.abs(arr[right] - arr[left]);
            if(diffrence < target){
                right++;
            }
            else if(diffrence > target){
                left++;
            }
            else{
                System.out.println("The pair are: " + arr[left] + " " + arr[right]);
                left++;
                right++;
            }
        }
    }
}
