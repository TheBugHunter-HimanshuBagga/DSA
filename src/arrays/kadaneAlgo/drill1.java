package arrays.kadaneAlgo;

public class drill1 {
    public static void main(String[] args) {
        int[] arr = {3, -4, 5, -1, 2, -6, 4};
        // to find the maximum contiguous subarray sum
        int max = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            currentSum += arr[i];
            if(currentSum < arr[i]){
                currentSum = arr[i];
            }
            max = Math.max(max, currentSum);
        }
        System.out.println(max);
    }
}
