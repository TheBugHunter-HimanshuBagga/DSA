package arrays.SlidingWindow.Fixed;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class drill6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 1, 2, 1};
        int k = 3;
        // count how many times 1 appear in a particular window size
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();;
        int count = 0;
        int left = 0;
        for(int right = 0 ; right < arr.length ; right++){
            int num = arr[right];
            list.add(num);
            if(list.size() == k){
                count = 0;
                 for(int i = 0 ; i < list.size() ; i++){
                     if(list.get(i) == 1){
                         count++;
                     }
                 }
                 result.add(count);
                 list.remove(left);
            }
        }
        for(int x : result){
            System.out.print(x + " ");
        }
    }
}
