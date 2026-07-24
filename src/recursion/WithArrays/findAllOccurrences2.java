package recursion.WithArrays;

import java.util.ArrayList;

public class findAllOccurrences2 {
    public static void main(String[] args) {
        // Find All Occurrences WITHOUT passing the list
        int arr[] = {1,2,3,2,4,1};
        System.out.print("Printing: ");
        helperFindAllOccurrences2(arr, 2, 0);
        System.out.println(arrayList);
    }
    static ArrayList<Integer> arrayList = new ArrayList<>();
    static void helperFindAllOccurrences2(int arr[], int target, int n){
        if(n == arr.length){
            return;
        }
        if(arr[n] == target){
            arrayList.add(n);
            helperFindAllOccurrences2(arr, target, n+1);
        }else{
            helperFindAllOccurrences2(arr,target,n+1);
        }
    }
}
