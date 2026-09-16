package arrays.TwoPOINTERS;

public class drill1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 6;

        int left = 0;
        int right = arr.length - 1;
        while(left < right){ // since pair should contain 2 different element each time
            if(arr[left] + arr[right] > target){
                right--;
            }
            else if(arr[left] + arr[right] < target){
                left++;
            }
            else{
                System.out.println("pair1: " + left + "," + right) ;
                break;
            }
        }

    }
}
