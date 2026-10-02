package StepPracticeAssessment70Questions.TwoPointers;

public class TwoSumII {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        // since arrat is sorted use 2 pointers
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum > target){
                right--;
            }
            else if(sum < target){
                left++;
            }
            else{
                System.out.println("Index1 : " + (left + 1) + " "+ "Index2 : " + (right+ 1));
                break;
            }
        }

    }
}
