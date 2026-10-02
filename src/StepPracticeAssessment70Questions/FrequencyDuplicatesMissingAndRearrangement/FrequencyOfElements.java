package StepPracticeAssessment70Questions.FrequencyDuplicatesMissingAndRearrangement;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements { // A7
    static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 3, 2};
        // Using HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            int num = arr[i];
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }
            else{
                map.put(num, 1);
            }
        }
        // Entry set is used when we need to print Key amd value pair from hashmap together
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+ "->" + entry.getValue());
        }
    }
}
