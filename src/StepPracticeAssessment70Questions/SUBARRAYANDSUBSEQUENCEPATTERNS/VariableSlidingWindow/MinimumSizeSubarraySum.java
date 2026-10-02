package StepPracticeAssessment70Questions.SUBARRAYANDSUBSEQUENCEPATTERNS.VariableSlidingWindow;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int target = 7;
        int left = 0;
        int sum = 0;
        int count = Integer.MAX_VALUE;
        for(int right = 0 ; right < arr.length ; right++){

            int num = arr[right];
            sum += num;
            while(sum >= target){
                count = Math.min(count, right - left + 1);
                sum -= arr[left];
                left++;
            }
        }
        System.out.println(count);
    }
}
