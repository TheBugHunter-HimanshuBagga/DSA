package arrays.SlidingWindow.Fixed;

public class drill3 {
    public static void main(String[] args) {
        int[] arr = {1, 12, -5, -6, 50, 3};
        int k = 4;
        int left = 0; // used for shrinking
        int max  = 0;
        int maxAvg = Integer.MIN_VALUE;
        for(int right = 0 ; right < arr.length ; right++){
            max += arr[right];
            if(right - left + 1 == k){
               maxAvg = Math.max(maxAvg, max);
               max -= arr[left];
               left++;
            }
        }
        System.out.println((double) maxAvg / k);
    }
}
