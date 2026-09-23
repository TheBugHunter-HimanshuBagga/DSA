package arrays.SlidingWindow.Variable;

import java.util.HashMap;
import java.util.HashSet;

public class drill3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 1, 3, 2, 1, 1};
        // Find the longest subarray containing at most 2 distinct numbers.
        int left = 0;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int right = 0; right < arr.length ; right++){
            int num = arr[right];
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }else{
                map.put(num , 1);
            }

            if(map.size() > 2){
                int removed = arr[left];
                map.put(removed, map.get(removed) - 1);
                left++;

                if(map.get(removed) == 0){
                    map.remove(removed);
                }
            }

            max = Math.max(max, right - left + 1);
        }
        System.out.println(max);
    }
}
