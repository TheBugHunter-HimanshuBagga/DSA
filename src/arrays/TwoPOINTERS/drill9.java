package arrays.TwoPOINTERS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class drill9 {
    public static void main(String[] args) {
        // find 3 number whose sum is 0
        int[] arr = {-4, -1, -1, 0, 1, 2};
        HashSet<List<Integer>> set = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();
        // fix one position then search between 2 (left, right)
        for(int i = 0 ; i < arr.length ; i++){
            int left = i + 1;
            int right = arr.length - 1;
            while(left < right){
                int sum = arr[i] + arr[left] + arr[right];
                if(arr[i] + arr[left] + arr[right] < 0){
                    left++;
                }
                else if(arr[i] + arr[left] + arr[right] > 0){
                    right--;
                }
                else{
                    List<Integer> inside = new ArrayList<>();
                    inside.add(arr[i]);
                    inside.add(arr[left]);
                    inside.add(arr[right]);

                    set.add(inside);

                    left++;
                    right--;
                }
            }
        }
        list.addAll(set);
        System.out.println(list);
    }
}
