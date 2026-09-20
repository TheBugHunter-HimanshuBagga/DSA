package arrays.TwoPOINTERS;

public class drill13 {
    public static void main(String[] args) {
        // move all negative numbers to the left
        int[] arr = {3, -2, 5, -7, 8, -1, 4, -6};
        int left = 0;
        for(int right = 0; right < arr.length ; right++){
            if(arr[right] < 0){
                int temp = arr[left];
                arr[left] = arr[right];
                left++;
                arr[right] = temp;
            }
        }
        for(int x: arr){
            System.out.print(x + " ");
        }
    }
}
