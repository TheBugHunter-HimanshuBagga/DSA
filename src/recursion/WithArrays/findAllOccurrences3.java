package recursion.WithArrays;

import java.util.ArrayList;

public class findAllOccurrences3 {
    public static void main(String[] args) {
        //Given an integer array arr and an integer target, return an ArrayList<Integer> containing all the indices at which the target appears.
        // use recursion + don't pass arrayList as a param
        // don't use global or static variables
        int[] arr = {1, 2, 3, 2, 4, 2};
        System.out.println(helperFindAllOccurrences3(arr, 2, 0));
    }
    static ArrayList<Integer> helperFindAllOccurrences3(int arr[], int target, int n){
        ArrayList<Integer> arrayList = new ArrayList<>(); // everyTime create a new arrayList
        if(n == arr.length){
            return arrayList;
        }

        if(arr[n] == target){
            arrayList.add(n);
        }
        // get answer from the remaining recursion
        ArrayList<Integer> answerFromBelowCalls = helperFindAllOccurrences3(arr, target, n+1);

        arrayList.addAll(answerFromBelowCalls);
        return arrayList;
    }
}
