package arrays.SlidingWindow.Variable;

public class drill4 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 1, 1, 0};
        int k = 2;
        // Find the longest contiguous subarray containing at most k zeros.
        int left = 0;
        int max = 0;
        int count  =0;
        for(int right = 0; right < arr.length ; right++){

            int num = arr[right]; // 1
            if(num == 0){
                count++;
            }
            if(count > k){
                int removed = arr[left];
                if(removed == 0){
                    count--;
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        System.out.println(max);
    }
}