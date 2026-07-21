package recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,88};
        System.out.println(BsHelper(arr, 5, 0, arr.length-1));
    }
    static int BsHelper(int arr[], int target , int start, int end){

        if(start > end){
            return -1; // answer not found
        }

        int mid = start + (end - start)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(target < arr[mid]){ // target suppose 1 hence 1,2,3,4,5,6,7,8
            // hence target is on left
            return BsHelper(arr, target, start, mid-1);
        }else{
            return BsHelper(arr,target,mid+1, end);
        }

    }
}
