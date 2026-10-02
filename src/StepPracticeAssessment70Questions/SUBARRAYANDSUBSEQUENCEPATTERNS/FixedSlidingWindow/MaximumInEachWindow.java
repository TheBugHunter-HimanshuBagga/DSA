package StepPracticeAssessment70Questions.SUBARRAYANDSUBSEQUENCEPATTERNS.FixedSlidingWindow;

import java.util.ArrayList;

public class MaximumInEachWindow {
    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int left = 0;
        int[] newArr = new int[arr.length - k + 1];
        int index = 0;
        ArrayList<Integer> inside = new ArrayList<>();
        for(int right = 0 ; right < arr.length ; right++){
            int num = arr[right];
            inside.add(num);
            if(inside.size() == k){
                int max = Integer.MIN_VALUE;
                for(int i = 0 ; i < inside.size() ; i++){
                    max = Math.max(max, inside.get(i));
                }
                newArr[index] = max;
                index++;

                inside.remove(left);
            }
        }
        for(int X : newArr){
            System.out.print(X + " ");
        }
    }
}
