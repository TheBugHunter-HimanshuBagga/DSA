package StepPracticeAssessment70Questions.SUBARRAYANDSUBSEQUENCEPATTERNS.FixedSlidingWindow;

public class MaximumSumOfSizeK {
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int k = 3;
        int left = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int right = 0 ; right < arr.length ; right++){
            sum += arr[right];
            if (right - left + 1 == k){ // window size is same
                max = Math.max(max, sum);
                sum -= arr[left];
                left++;
            }
        }
        System.out.println(max);
    }
}
