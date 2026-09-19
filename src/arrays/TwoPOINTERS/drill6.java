package arrays.TwoPOINTERS;

import java.util.ArrayList;
import java.util.HashSet;

public class drill6 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,4,4};
        ArrayList<Integer> listResult = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                listResult.add(nums[i]);
            }
        }
        for(int x : listResult){
            System.out.print(x + " ");
        }
    }
}
