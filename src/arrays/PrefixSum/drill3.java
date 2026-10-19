package arrays.PrefixSum;

public class drill3 {
    public static void main(String[] args) {
        // Range Sum query with a METHOD
        int[] arr = {2,4,1,5,3};

        int[] prefix = new int[arr.length];
        int index = 0;

        prefix[index] = arr[0];
        index++;

        for(int i = 1 ; i < arr.length ; i++){
            prefix[index] = prefix[i - 1] + arr[i];
            index++;
        }

        for(int X : prefix){
            System.out.print(X + " ");
        }
        System.out.println();
        System.out.println(helper(prefix, 2 , 3));

    }
    public static int helper(int[] prefix, int L , int R){
        if(L > 0){
            return prefix[R] - prefix[L-1];
        }else{
            return prefix[R];
        }
    }
}
