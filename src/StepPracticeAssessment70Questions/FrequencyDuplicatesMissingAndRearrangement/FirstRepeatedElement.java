package StepPracticeAssessment70Questions.FrequencyDuplicatesMissingAndRearrangement;

import java.util.HashSet;

public class FirstRepeatedElement { // A9
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 3, 2};
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < arr.length ; i++){
            int num = arr[i];
            if(set.contains(num)){
                System.out.println(arr[i]);
                break;
            }else{
                set.add(num);
            }
        }
    }
}
