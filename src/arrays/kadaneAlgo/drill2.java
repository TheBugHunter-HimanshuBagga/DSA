package arrays.kadaneAlgo;

public class drill2 {
    public static void main(String[] args) {
        int[] arr = {-7, -2, -5, 4, -1, -2};
        // find maximum contiguous subarray sum
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ;i < arr.length ; i++){
            sum += arr[i];
            if(sum < arr[i]){
                sum = arr[i];
            }
            max = Math.max(sum , max);
        }
        System.out.println(max);
    }
}
