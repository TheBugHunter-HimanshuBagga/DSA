package arrays.SlidingWindow.Fixed;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class drill4 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int left = 0;
        int minInWindow = Integer.MAX_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int right = 0 ; right < arr.length ; right++){
            int num = arr[right];
            list.add(num);
            if(list.size() == k){
//                list.sort(null);
//                result.add(list.get(0));

                for(int i = 0 ; i < list.size() ; i++){
                    minInWindow = Math.min(minInWindow, list.get(i));
                }

                result.add(minInWindow);
                list.remove(left);
            }
        }
        for(int x : result){
            System.out.print(x + " "  );
        }
    }
}
