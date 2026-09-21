package arrays.TwoPOINTERS;

public class drill18 {
    public static void main(String[] args) {
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        // Trapping rain water
        int left = 0;
        int maxArea = 0;
        for(int right = 0 ; right < arr.length - 1 ; right++){
            if(arr[right] != 0){
                if(arr[left] == 0){
                    arr[left] = arr[right];
                    left++;
                }
                else{
                    // left 1 and right 2
                    int wall = Math.min(arr[left] , arr[right]);
                    // 1
                    maxArea = wall * wall + maxArea;
                    left++;
                    right++;
                }
            }
        }
        System.out.println(maxArea);
    }
}
