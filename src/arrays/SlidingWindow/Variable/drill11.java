package arrays.SlidingWindow.Variable;

import java.util.HashMap;

public class drill11 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1};
        int k = 2;
        // Find the number of subarrays containing at most 2 ones.
        int left = 0;
        int count = 0;
        int count1 = 0;
        for(int right = 0; right < arr.length ; right++){
            int num = arr[right];
            if(num == 1){
                count1++;
            }

            while(count1 > k){
                int remove = arr[left];
                if(remove == 1){
                    count1--;
                }
                left++;
            }

            count += right - left + 1;
        }
        System.out.println(count);
    }
}
