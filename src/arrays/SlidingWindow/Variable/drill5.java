package arrays.SlidingWindow.Variable;

public class drill5 {
    public static void main(String[] args) {
        int []arr = {3, 1, 2, 1, 1, 4, 2};
        int k = 7;
        // Find the length of the longest contiguous subarray whose sum is ≤ 7.
        int left = 0;
        int max = 0;
        int sum = 0;
        for(int right = 0 ; right < arr.length ; right++){
            sum += arr[right];
            while(sum > k){
                sum -= arr[left];
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        System.out.println(max);
    }
}
