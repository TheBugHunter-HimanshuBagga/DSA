package arrays.SlidingWindow.Fixed;

public class drill1 {
    public static void main(String[] args) {
        int arr[] = {2,1,5,1,3,2};
        int left = 0;
        int k = 3; // window size
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int right = 0 ; right < arr.length ; right++){
            sum += arr[right];
            if(right - left + 1 == k){
                maxSum = Math.max(maxSum, sum);

                sum -= arr[left];
                left++;
            }

        }
        System.out.println(maxSum);
    }
}
