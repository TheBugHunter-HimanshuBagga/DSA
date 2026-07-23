package recursion.WithArrays;

public class sortedOrNot {
    public static void main(String[] args) {
        // Recursion in Arrays
        // given array find if it sorted or not
        int arr[] = {1,2,3,4,7,6};
        System.out.println(helperIsSorted(arr,0));
    }
    static boolean helperIsSorted(int arr[], int index){
        if(index == arr.length-1){
            return true;
        }
        if(arr[index] > arr[index+1]){
            return false;
        }
        return helperIsSorted(arr, index+1);
    }
}
