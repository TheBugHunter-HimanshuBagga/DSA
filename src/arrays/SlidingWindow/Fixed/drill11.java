package arrays.SlidingWindow.Fixed;

import java.util.ArrayList;

public class drill11 {
    public static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        // finding the maximum element in every fixed-size window of size k.
        int left = 0;
        int max = 0;
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int right = 0 ; right < arr.length ; right++){
            int num = arr[right];
            list.add(num);
            if(list.size() == k){
                int bigg = Integer.MIN_VALUE;
                for(int i = 0 ; i < list.size() ; i++){
                    bigg = list.get(i);
                    max = Math.max(bigg, max);
                }
                list.remove(left);
                result.add(max);
            }
        }
        for(int X : result){
            System.out.print(X + " ");
        }
    }
}
