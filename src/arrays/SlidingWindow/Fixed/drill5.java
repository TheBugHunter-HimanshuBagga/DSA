package arrays.SlidingWindow.Fixed;

import java.util.ArrayList;

public class drill5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        int left = 0;
        int max = 0;
        int maxInWindow = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int right = 0; right < arr.length ; right++){
            int num = arr[right];
            list.add(num);
            if(list.size() == k){

                for(int i = 0 ; i < list.size() ; i++){
                    maxInWindow = Math.max(maxInWindow, list.get(i));
                }
                result.add(maxInWindow);
                list.remove(left);
            }
        }
        for(int x : result){
            System.out.print(x + " ");
        }
    }
}
