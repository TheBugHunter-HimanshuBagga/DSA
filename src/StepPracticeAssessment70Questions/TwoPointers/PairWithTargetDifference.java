package StepPracticeAssessment70Questions.TwoPointers;

import java.util.Arrays;

public class PairWithTargetDifference {
    public static void main(String[] args) {
        int[] arr = {5,20,3,2,50,80};
        int k = 30;
        boolean found = false;
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int difference = arr[right] - arr[left]; // 80 - 2 = 78
            if(difference < k){
                right--;
            }
            else if(difference > k){
                left++;
            }
            else{
                if(difference == k){
                    found = true;
                    break;
                }
            }
        }
        System.out.println(found);
    }
}
