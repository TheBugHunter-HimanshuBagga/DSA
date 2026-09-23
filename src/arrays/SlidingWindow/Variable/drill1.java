package arrays.SlidingWindow.Variable;

public class drill1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 2};
        int target = 5;
        // sum <= target
        int left = 0;
        int sum = 0;
        int max = 0;
        for(int right = 0; right < arr.length ; right++){
            sum += arr[right];
            if(sum > target){ // while window is invalid
                sum -= arr[left];
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        System.out.println(max);
    }
}
