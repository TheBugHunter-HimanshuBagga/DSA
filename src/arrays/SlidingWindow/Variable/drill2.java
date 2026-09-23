package arrays.SlidingWindow.Variable;

public class drill2 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int target = 7;
        // Find the longest contiguous subarray whose sum is ≤ 7.
        int left = 0;
        int sum = 0;
        int max = 0;
        for(int right = 0; right < arr.length ; right++){
            sum += arr[right];
            if(sum > target){ // window is invalid
                sum -= arr[left];
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        System.out.println(max);
    }
}
