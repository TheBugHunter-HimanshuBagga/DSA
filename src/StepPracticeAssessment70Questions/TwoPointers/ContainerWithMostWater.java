package StepPracticeAssessment70Questions.TwoPointers;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        // return maximum water areas between 2 lines
        // area = width * height of the short tower
        int left = 0;
        int right = arr.length - 1;
        int max = Integer.MIN_VALUE;
        while(left < right){
            int width = right - left; // 8
            int height = Math.min(arr[left] , arr[right]);
            max = Math.max(max, width * height);
            if(arr[left] < arr[right]){
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println(max);
    }
}
