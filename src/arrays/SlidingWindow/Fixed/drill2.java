package arrays.SlidingWindow.Fixed;

public class drill2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 5, 6, 2};
        int k = 3;
        int left = 0;
        int minSum = Integer.MAX_VALUE;
        int maz = 0;
        for(int right = 0; right < arr.length ; right++){
            maz += arr[right];
            if(right - left + 1 == k){
                minSum = Math.min(minSum, maz);

                maz -= arr[left];
                left++;
            }
        }
        System.out.println(minSum);
    }
}
