package arrays.TwoPOINTERS;

public class drill15 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        // move all zeros to the end
        int left = 0;
        for(int right = 0 ;  right < arr.length ; right++){
            if(arr[right] != 0){
                int temp = arr[left];
                arr[left] = arr[right];
                left++;
                arr[right] = temp;
            }
        }
        for(int X : arr){
            System.out.print(X + " ");
        }
    }
}
