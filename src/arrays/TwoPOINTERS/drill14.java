package arrays.TwoPOINTERS;

public class drill14 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        // all even to left and all odd to the right without preserving the real order
        int left = 0;
        for(int right = 0 ; right < arr.length ; right++){
            if(arr[right] % 2 == 0){
                int temp = arr[left];
                arr[left] = arr[right];
                left++;
                arr[right] = temp;
            }
        }
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}
