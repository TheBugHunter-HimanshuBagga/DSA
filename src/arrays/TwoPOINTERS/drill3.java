package arrays.TwoPOINTERS;

public class drill3 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,8,9};
        int target = 10;

        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            if(arr[left] + arr[right] > target){
                right--;
            }
            else if(arr[left] + arr[right] < target){
                left++;
            }
            else{
                System.out.println("True" + " pair: " + left + "," + right );
                break;
            }
        }
    }
}
