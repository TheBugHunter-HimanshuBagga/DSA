package arrays.SlidingWindow.Variable;

public class drill9 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 4};
        int k = 20;

        // Find the number of contiguous subarrays whose product is < 20.
        int left = 0;
        int product = 1;
        int count = 0;
        for(int right = 0 ; right < arr.length ; right++){
            product *= arr[right];
            while(product >= k){
                product = product / arr[left];
                left++;
            }
            count += right - left + 1;
        }
        System.out.println(count);
    }
}
