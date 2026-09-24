package arrays.SlidingWindow.Variable;

public class drill10 {
    public static void main() {
        int[] arr = {1, 2, 1, 1};
        int k = 3;
        // Find the number of contiguous subarrays whose sum is ≤ 3.
        int left = 0;
        int count = 0;
        int sum = 0;
        for(int right = 0 ; right < arr.length ; right++){
            sum += arr[right];
            while(sum > k){
                sum -= arr[left];
                left++;
            }
            count += right - left + 1;
        }
        System.out.println(count);
    }
}
