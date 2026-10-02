package StepPracticeAssessment70Questions.FrequencyDuplicatesMissingAndRearrangement;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicateHashSet { // A8
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < arr.length ; i++){
            int num = arr[i];
            if(set.contains(num)){
                System.out.println(true);
                break;
            }
            else{
                set.add(num);
            }
        }
        System.out.print("SET: ");
        for(int X : set){
            System.out.print(X + " ");
        }
    }
}
