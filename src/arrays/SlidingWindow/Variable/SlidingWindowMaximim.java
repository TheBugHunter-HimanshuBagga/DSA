package arrays.SlidingWindow.Variable;

import java.util.ArrayList;

public class SlidingWindowMaximim {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] newArr = new int[nums.length - k + 1];
        int index = 0;

        int left = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int right = 0; right < nums.length; right++) {
            list.add(nums[right]);

            if (list.size() == k) {
                int max = Integer.MIN_VALUE;

                for (int i = 0; i < list.size(); i++) {
                    max = Math.max(max, list.get(i));
                }

                newArr[index] = max;
                index++;

                list.remove(left);
            }
        }
        for(int X : newArr){
            System.out.print(X + " ");
        }
    }
}
