package StepPracticeAssessment70Questions.SUBARRAYANDSUBSEQUENCEPATTERNS.FixedSlidingWindow;

import java.util.ArrayList;

public class CountTargetInEachWindow {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,1,2,1};
        int k = 3;
        int target = 1;
        int left = 0;
        int count = 0;
        int[] newArr = new int[arr.length - k + 1];
        int index = 0;
        ArrayList<Integer> compare = new ArrayList<>();
        for(int right = 0 ; right < arr.length ; right++){
            int num = arr[right];
            compare.add(num);
            if(num == target){
                count++;
            }
            if(compare.size() == k){
                newArr[index] = count;
                index++;

                int remove = compare.remove(left); // automatically shit all position to left
                if(remove == target){
                    count--;
                }
            }
        }
        for(int X : newArr){
            System.out.print(X + " ");
        }
    }
}
