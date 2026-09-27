package arrays.SlidingWindow.Fixed;

import java.util.ArrayList;

public class drill12 {
    public static void main() {
        int[] arr = {1, 2, 1, 3, 1, 2, 1};
        int k = 3;
        // count occurences of 1 in every window
        int left = 0;
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int right = 0 ; right < arr.length ; right++){
            int num = arr[right];
            if(num == 1){
                count++;
            }
            if(right - left + 1 == k){
                list.add(count);

                if(arr[left] == 1){
                    count--;
                }
                left++;
            }
        }
        for(int X : list){
            System.out.print(X + " ");
        }
    }
}
