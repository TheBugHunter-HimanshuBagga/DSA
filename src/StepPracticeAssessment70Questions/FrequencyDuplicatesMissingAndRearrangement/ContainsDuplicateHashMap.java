package StepPracticeAssessment70Questions.FrequencyDuplicatesMissingAndRearrangement;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateHashMap { // A8
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            int num = arr[i];
            if(map.containsKey(num)){
                System.out.println(true);
                map.put(num, map.get(num) + 1);
                break;
            }
            else{
                map.put(num, 1);
            }
        }
        System.out.println();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

    }
}
