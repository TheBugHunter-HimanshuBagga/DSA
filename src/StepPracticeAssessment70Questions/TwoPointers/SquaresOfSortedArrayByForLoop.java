package StepPracticeAssessment70Questions.TwoPointers;

import java.util.Arrays;

public class SquaresOfSortedArrayByForLoop {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        int index = 0;
        for(int i = 0 ; i < arr.length ; i++){
            arr[index] = arr[i] * arr[i];
            index++;
        }
        Arrays.sort(arr);
        for(int X : arr){
            System.out.print(X + " ");
        }
    }
}
