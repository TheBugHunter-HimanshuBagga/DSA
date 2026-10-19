package arrays.PrefixSum;

public class drill4 {
     public static void main(String[] args) {
        int[] arr = {2,4,1,5,3};
         // Average of any RANGE
         int [] prefix = new int[arr.length];
         int index = 0;

         prefix[index] = arr[0];
         index++;

         for(int i = 1 ; i < arr.length ; i++){
             prefix[index] = prefix[index - 1] + arr[i];
             index++;
         }

         for(int X : prefix){
             System.out.print(X + " ");
         }

         System.out.println();
         System.out.println("Avg of Range Sum : " + helperRangeQuery(prefix, 1 , 4));
    }
    public static double helperRangeQuery(int[] prefix, int L , int R){
         double rangeQuery = 0;
         if(L > 0){
             rangeQuery = prefix[R] - prefix[L - 1];
         }else{
             rangeQuery = prefix[R];
         }

         return helperAvg(rangeQuery, L, R);

    }

    public static Double helperAvg(double rangeQuery , int L , int R){
         return  rangeQuery / (R - L + 1);
    }
}
