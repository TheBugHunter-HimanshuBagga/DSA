package arrays.SlidingWindow.Fixed;

public class drill7 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 8, 2, 9, 1};
        int k = 3;

        // to find elements greater than 5 in a window size of k
        int left = 0;
        int count = 0;
        for(int right = 0 ; right < arr.length ; right++){
            if(arr[right] > 5){
                count++;
            }
            if(right - left + 1 == k){ // we are inside the correct window size
                System.out.print(count + " ");

                if(arr[left] > 5){
                    count--;
                    left++;
                }else{
                    left++;
                }
            }
        }

    }
}
