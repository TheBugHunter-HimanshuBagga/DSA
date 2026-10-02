package StepPracticeAssessment70Questions.FrequencyDuplicatesMissingAndRearrangement;

public class MoveZeroes { // A11
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int left = 0;
        for(int right = 0 ; right < arr.length ; right++){
            if(arr[right] != 0){ // [1,3,12,3,12]
                arr[left] = arr[right];
                left++;
            }
        }
        System.out.println(left);


        for(int i = left ; i < arr.length ; i++){
            arr[left] = 0;
            left++;
        }

        // arr
        for(int X : arr){
            System.out.print(X + " ");
        }
    }
}
