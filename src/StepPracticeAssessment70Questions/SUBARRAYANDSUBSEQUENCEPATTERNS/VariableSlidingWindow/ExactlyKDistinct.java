package StepPracticeAssessment70Questions.SUBARRAYANDSUBSEQUENCEPATTERNS.VariableSlidingWindow;

import java.util.HashMap;

public class ExactlyKDistinct {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3};
        int k = 2;
        System.out.println(helper(arr, k) - helper(arr, k-1));
    }
    public static int helper(int[] arr, int k){
        int left = 0;
        int count = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int right = 0 ; right < arr.length ; right++){
            if(map.containsKey(arr[right])){
                map.put(arr[right] , map.get(arr[right]) + 1);
            }
            else {
                map.put(arr[right] , 1);
            }

            while(map.size() > k){
                int removed = arr[left];
                map.put(removed, map.get(removed) - 1);
                if(map.get(removed) == 0){
                    map.remove(removed);
                }
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
}
