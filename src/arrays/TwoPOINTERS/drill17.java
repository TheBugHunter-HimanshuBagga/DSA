package arrays.TwoPOINTERS;

public class drill17 {
    public static void main(String[] args) {
        int arr[] = {2,0,2,1,1,0};
        // using # pointers Dutsch National Flag
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while(mid < high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                mid++;
                low++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
        for(int X : arr){
            System.out.print(X + " ");
        }
    }
}
