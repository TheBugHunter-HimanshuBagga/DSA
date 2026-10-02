package StepPracticeAssessment70Questions.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ThreeSum {
    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        Arrays.sort(arr);
        for(int X : arr ){
            System.out.print(X + " ");
        }
        int target = 0;
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        // return all triplets whose sum equals target
        for(int i = 0 ; i < arr.length ; i++){
            int left = i + 1;
            int right = arr.length - 1;
            while(left < right){
                int sum = arr[left] + arr[right] + arr[i];
                if(sum < target){
                    left++;
                }
                else if(sum > target){
                    right--;
                }
                else{
                    ArrayList<Integer> inside = new ArrayList<>();
                    inside.add(arr[i]);
                    inside.add(arr[left]);
                    inside.add(arr[right]);

                    left++;
                    right--;
                    set.add(inside);
                }
            }
        }
        result.addAll(set);
        System.out.println();
        System.out.print("Pairs: ");
        for(ArrayList<Integer> list : result){
            System.out.print(list + ",");
        }
    }
}
