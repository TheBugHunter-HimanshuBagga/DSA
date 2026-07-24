package recursion.WithArrays;

import java.util.ArrayList;

public class findAllOccurrences {
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,4,1};
         // to get all the recurrences of an element
        System.out.println(helperFindAllOccurrences(arr,1,0, new ArrayList<>()));
    }
    static ArrayList<Integer> helperFindAllOccurrences(int arr[], int target, int n, ArrayList<Integer> arrayList){
        if(n == arr.length){
            return arrayList;
        }
        if(arr[n] == target){
            arrayList.add(n);
            return helperFindAllOccurrences(arr, target, n+1, arrayList);
        }else{
            return helperFindAllOccurrences(arr, target, n+1, arrayList);
        }
    }
}
