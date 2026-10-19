package arrays.PrefixSum;

public class drill2 {
    public static void main(String[] args) {
        int[] arr = {2,4,5,1,3};
        int  L = 1;
        int R = 3;
        int output = 0;
        // L = 1, R = 3 . Output = 10
        // Range Sum Query
        int[] prefix = new int[arr.length];
        int index = 0;

        prefix[index] = arr[0];
        index++;

        for(int i = 1; i < arr.length ; i++){
            prefix[index] = prefix[index - 1] +  arr[i];
            index++;
        }

        // for L = 1, R = 3

        if(L > 0){
            output = prefix[R] - prefix[L - 1];
        }
        else{
            output = prefix[R];
        }

        for(int X : prefix){
            System.out.print(X + " ");
        }
        System.out.println();
        System.out.println("OUTPUT: " + output);
    }
}
