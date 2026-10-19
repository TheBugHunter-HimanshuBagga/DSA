package arrays.PrefixSum;

public class drill1 {
    public static void main(String[] args) {
        int[] arr = {2,4,1,5,3};
        int n = arr.length;
        // Prefix sum
        int[] prefix = new int[n];
        int index = 0;

        prefix[index] = arr[0];
        index++;

        for(int i = 1 ; i < n ; i++){
            prefix[index] = prefix[index-1] + arr[i];
            index++;
        }
        for(int X : prefix){
            System.out.print(X + " ");
        }
    }
}
