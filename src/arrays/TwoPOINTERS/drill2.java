package arrays.TwoPOINTERS;

public class drill2 {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,7,9};
        int target = 12;

        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            if(arr[left] + arr[right] < target){ // 1 + 9 = 10 < 12, 2 + 9 = 11 < 12
                left++;
            }
            else if(arr[left] + arr[right] > target){
                right--;
            }
            else{
                System.out.println("Pair: " + left + "," + right);
                break;
            }
        }
    }
}
