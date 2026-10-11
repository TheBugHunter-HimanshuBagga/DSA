package arrays.SlidingWindow.Variable;

public class ayMostKones {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1};
        int k = 2;
        // number of subarrays containing at most k ones
        int left = 0;
        int count = 0;
        int count1 = 0;
        for(int right = 0 ; right < arr.length ; right++){
            if(arr[right] == 1){
                count1++;
            }
            while(count1 > k){
                if(arr[left] == 1){
                    count1--;
                }
                left++;
            }
            count += right - left + 1;
        }
        System.out.println(count);
    }
}
