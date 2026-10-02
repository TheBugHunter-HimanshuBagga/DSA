package StepPracticeAssessment70Questions.SUBARRAYANDSUBSEQUENCEPATTERNS.FixedSlidingWindow;

public class MinimumSumOfSizeK {
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int k = 3;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;
        for(int right = 0 ; right < arr.length ; right++){
            sum += arr[right];
            if(right - left + 1 == k){ // window size
                min = Math.min(min, sum);

                sum -= arr[left];
                left++;
            }
        }
        System.out.println(min);
    }
}
