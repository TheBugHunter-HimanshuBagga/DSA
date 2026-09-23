package arrays.SlidingWindow.Variable;

public class drill7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 2;
        // Find the length of the longest contiguous subarray containing at most 2 odd numbers.
        int left = 0;
        int max = 0;
        int count  = 0;
        for(int right  = 0; right < arr.length ; right++){
            int num = arr[right];
            if(num % 2 != 0){ // odd
                count++;
            }
            if(count > k){
                int removed = arr[left];
                if(removed % 2 != 0){
                    count--;
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        System.out.println(max);
    }
}
