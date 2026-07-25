package recursion.WithArrays;

public class RotatedBinarySearch {
    public static void main() {
        int arr[] = {5,6,7,8,9,1,2,3};
        // Rotated Binary Search -> only worked fopr rotated sorted and completely sorted
        // not work for completely unsorted
        System.out.println(helperRotatedBinarySearch(arr, 2, 0, arr.length - 1));
    }
    static int helperRotatedBinarySearch(int arr[], int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[start] <= arr[mid]){
            if(target >= arr[start] && target < arr[mid]){
                return helperRotatedBinarySearch(arr, target, start, mid - 1);
            }
            return helperRotatedBinarySearch(arr, target, mid + 1, end);
        }

        if(target > arr[mid] && target <= arr[end]){
            return helperRotatedBinarySearch(arr, target, mid+1, end);
        }
        return helperRotatedBinarySearch(arr, target, start, mid - 1);
    }
}
