package arrays.Subs;

import java.util.ArrayList;

public class SubArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i ; j < arr.length ; j++){
                for(int k = i ; k <= j ; k++){
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }
}
