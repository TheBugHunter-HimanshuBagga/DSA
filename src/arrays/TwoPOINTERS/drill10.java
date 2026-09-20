package arrays.TwoPOINTERS;

public class drill10 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 10, 12};
        int target = 7;

        // find pair whise absolute difference is target
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            int diffrence = Math.abs(arr[right] - arr[left]);
            if(diffrence > target){
                right--;
            }
            else if(diffrence < target){
                left++;
            }
            else{
                System.out.println("The abs diffrence pair is: " + arr[left] + " " + arr[right]);
                left++;
                right--;
            }
        }
    }
}
