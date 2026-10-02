package StepPracticeAssessment70Questions.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FourSum {
    public static void main(String[] args) {
        int[] arr = {1,0,-1,0,-2,2};
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        int target=0;
        System.out.print("sorted: ");
        for(int X : arr){
            System.out.print(X + " ");
        }
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i + 1 ; j < arr.length ; j++){
                int left = j + 1;
                int right = arr.length - 1;
                while(left < right){
                    int sum = arr[i] + arr[j] + arr[left] + arr[right] ;
                    if(sum < target){
                        left++;
                    }
                    else if(sum > target){
                        right--;
                    }
                    else{
                        ArrayList<Integer> inside = new ArrayList<>();
                        inside.add(arr[i]);
                        inside.add(arr[j]);
                        inside.add(arr[left]);
                        inside.add(arr[right]);

                        set.add(inside);
                        left++;
                        right--;
                    }
                }
            }
        }
        System.out.println();
        System.out.print("RESULT: ");
        result.addAll(set);
        for(ArrayList<Integer> list: result){
            System.out.print(list + ", ");
        }
    }
}
