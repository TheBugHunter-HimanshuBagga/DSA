package arrays.SlidingWindow.Fixed;

import java.util.ArrayList;
import java.util.HashMap;

public class drill9 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 2, 3, 3};
        int k = 4;

        // to find frequency of most frequent element

        int left = 0;
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxFrequency = 0;
        for(int right = 0 ; right < arr.length ; right++){
            map.clear();
            int num = arr[right];
            list.add(num); // [1, 2, 2, 3]
            if(list.size() == k){ // window size
                for(int i = 0 ; i < list.size() ; i++){

                    if(map.containsKey(list.get(i))){
                        map.put(list.get(i), map.get(list.get(i)) + 1);
                    }
                    else{
                        map.put(list.get(i) , 1);
                    }
                }
                /*
                1 -> 1
                2 -> 2
                3 -> 1
                 */
                for(int frequency : map.values()){
                    maxFrequency = Math.max(maxFrequency, frequency);
                }
                System.out.print(maxFrequency + " ");

                list.remove(left);
                maxFrequency = 0;
            }
        }
    }
}
