package arrays.TwoPOINTERS;

import java.util.Arrays;

public class drill12 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 3, 4, 2, 5};
        System.out.print("Before sort: ");
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
        int target = 2;
        Arrays.sort(arr);
        System.out.print("After sort: ");
        for(int x : arr){
            System.out.print(x + " ");
        }System.out.println();
        int left = 0;
        for(int right = 0; right < arr.length ; right++){
            if(arr[right] != target){
                arr[left] = arr[right];
                left++;
            }
        }
        System.out.print("Final: ");
        for(int j = 0 ; j < left ; j++){
            System.out.print(arr[j] + " ");
        }
    }
}
/*
left moves only when we found the
 */
