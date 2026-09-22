package arrays.SlidingWindow.Fixed;

import java.util.ArrayList;
import java.util.HashSet;

public class drill8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2, 1, 4};
        int k = 3;

        // to find the number of distinct elements in a window of size k

        int left = 0;
        int countDistinctInK = 0;

        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int right = 0 ; right < arr.length ; right++){
            int num = arr[right];
            list.add(num); // [1,2,1,3]
            if(list.size() == k){ // window size
                set.clear();
                countDistinctInK = 0;
                for(int i = 0 ; i  < list.size() ; i++){
                    set.add(list.get(i));
                }
                for(int x : set){
                    countDistinctInK++;
                }
                System.out.print(countDistinctInK + " ");


                list.remove(left);
            }
        }


    }
}
