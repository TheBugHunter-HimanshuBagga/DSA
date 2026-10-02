package StepPracticeAssessment70Questions.SUBARRAYANDSUBSEQUENCEPATTERNS.VariableSlidingWindow;

import java.util.HashMap;

public class LongestAtMostKDistinct {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3};
        // output is 4
        int k  = 2;
        int left = 0;
        int count = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int right = 0 ; right < arr.length ; right++){
            int num = arr[right];
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num, 1);
            }

            while(map.size() > k){
                int removed = arr[left];
                map.put(removed, map.get(removed) - 1);
                if(map.get(removed) == 0){
                    map.remove(removed);
                }
                left++;
            }
            count = Math.max(count, right - left + 1);
        }
        System.out.println(count);
    }
}
