package StepPracticeAssessment70Questions.TwoPointers;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        int mid = 0;
        int left = 0;
        int right = arr.length - 1;
        while(mid <= right){
            if(arr[mid] == 0){
                int temp = arr[left];
                arr[left] = arr[mid];
                left++;
                arr[mid] = temp;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }else{
                int temp = arr[right];
                arr[right] = arr[mid];
                arr[mid] = temp;
                right--;
            }
        }
        for(int X : arr){
            System.out.print(X + " ");
        }
    }
}
