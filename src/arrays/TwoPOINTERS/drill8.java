package arrays.TwoPOINTERS;

import java.util.ArrayList;

public class drill8 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int target = 6;
        ArrayList<ArrayList<Integer>> pair = new ArrayList<>();
        // to find all pairs with the target sum
        int left = 0;
        int right = arr.length - 1;
        //
        while(left < right){
            if(arr[left] + arr[right] > target){
                right--;
            }
            else if(arr[left] + arr[right] < target){
                left++;
            }
            else{
                ArrayList<Integer> list = new ArrayList<>();
                list.add(arr[left]);
                list.add(arr[right]);
                pair.add(list);
                left++;
                right--;
            }
        }
        System.out.println(pair);
    }
}
