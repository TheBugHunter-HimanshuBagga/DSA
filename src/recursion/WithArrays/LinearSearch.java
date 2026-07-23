package recursion.WithArrays;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1,5,2,4,8,6};
/*                              not recursive
        int target = 8;
        for(int i=0 ; i < arr.length - 1; i++){
            if(arr[i] == target){
                System.out.println(i);
            }
        }

 */
        System.out.println(helperLinearSearch(arr, 80 , 0));

    }
    // Recurssive
    static int helperLinearSearch(int arr[], int target, int n){
        if(n == arr.length - 1){ // base case
            System.out.print("Not Found: ");
            return -1;
        }
        if(arr[n] == target){
            return n;
        }
        else{
            return helperLinearSearch(arr, target, n+1);
        }
    }
}
