package StepPracticeAssessment70Questions.FrequencyDuplicatesMissingAndRearrangement;

public class RotateArrayRight {// A13
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 6;
        k = k % arr.length;
        int[] newArr = new int[arr.length]; // 5 - 2 = 3
        int index = 0;

        for(int i = arr.length - k ; i < arr.length ; i++){
            newArr[index] = arr[i];
            index++;
        }

        for(int j = 0 ; j < arr.length - k; j++){
            newArr[index] = arr[j];
            index++;
        }

        for(int X : newArr){
            System.out.print(X + " ");
        }
    }
}
