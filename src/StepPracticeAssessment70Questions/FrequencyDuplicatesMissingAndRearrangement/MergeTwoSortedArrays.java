package StepPracticeAssessment70Questions.FrequencyDuplicatesMissingAndRearrangement;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,6};
        int[] newArr = new int[arr1.length + arr2.length];
        int index = 0;
        for(int i = 0 ; i < arr1.length; i++){
            newArr[index] = arr1[i];
            index++;
        }
        for(int i = 0 ; i < arr2.length ; i++){
            newArr[index] = arr2[i];
            index++;
        }
//        Arrays.sort(newArr);
        for(int p = 0 ; p < newArr.length ; p++){
            for(int q = p + 1 ; q < newArr.length ; q++){
                if(newArr[p] > newArr[q]){
                    int temp = newArr[p];
                    newArr[p] = newArr[q];
                    newArr[q] = temp;
                }
            }
        }
        for(int X : newArr){
            System.out.print(X + " ");
        }
    }
}
