package StepPracticeAssessment70Questions.FrequencyDuplicatesMissingAndRearrangement;

import java.util.HashSet;

public class MissingNumber { // A10
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};

        int[] compareArray = new int[arr.length + 1];
        int index = 0;
        int num = 0;
        for(int i = 0 ; i < compareArray.length ; i++){
            num += 1;
            compareArray[index] = num - 1;
            index++;
        }

        HashSet<Integer> set = new HashSet<>();
        for(int j = 0 ; j < arr.length ; j++){
            set.add(arr[j]);
        }
        System.out.print("New Array: ");
        for(int X : compareArray){
            System.out.print(X +" ");
        }
        System.out.println();
        for(int k = 0 ; k < compareArray.length ; k++){
            if(!set.contains(compareArray[k])){
                System.out.println("Hence Missing number is: " + compareArray[k]);
            }
        }
    }
}
