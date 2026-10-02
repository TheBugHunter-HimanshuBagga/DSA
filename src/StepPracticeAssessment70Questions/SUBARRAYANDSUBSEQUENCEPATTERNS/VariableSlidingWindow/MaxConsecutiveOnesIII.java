package StepPracticeAssessment70Questions.SUBARRAYANDSUBSEQUENCEPATTERNS.VariableSlidingWindow;

public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        int count = Integer.MIN_VALUE;
        int left = 0;
        int onesss = 0;
        for(int right = 0 ; right < arr.length ; right++){
            int num = arr[right];
            if(num == 0){
                onesss++;
            }
            while(onesss > k){
                int remove = arr[left];
                if(remove == 0){
                    onesss--;
                }
                left++;
            }
            count = Math.max(count, right - left + 1);
        }
        System.out.println(count);
    }
}
