package StepPracticeAssessment70Questions.SUBARRAYANDSUBSEQUENCEPATTERNS.VariableSlidingWindow;

public class LongestSubarraySumLessThanK {
    public static void main(String[] args) {
        int[] arr = {1,2,1,1,3,2,1,1};
        int k = 5;
        int left = 0;
        int count = Integer.MIN_VALUE;
        int sum = 0;
        for(int right = 0 ; right < arr.length ; right++){
            sum += arr[right];
            while(sum >= k){
                sum -= arr[left];
                left++;
            }
            count = Math.max(count, right - left + 1);
        }
        System.out.println(count);
    }
}
