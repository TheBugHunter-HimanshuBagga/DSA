package arrays.PrefixSum;

public class pivot {
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};

        int[] prefixFromStart = new int[arr.length];
        int index1 = 0;

        prefixFromStart[index1] = arr[0];
        index1++;

        for(int i = 1 ; i < arr.length ; i++){
            prefixFromStart[index1] = prefixFromStart[index1 - 1] + arr[i];
            index1++;
        }
        System.out.print("From start : ");
        for(int X : prefixFromStart){
            System.out.print(X + " ");
        }

        int[] prefixFromEnd = new int[arr.length];
        int index2 = prefixFromEnd.length - 1;

        prefixFromEnd[index2] = arr[arr.length - 1];
        index2--;

        for(int i = arr.length - 1 - 1 ; i >= 0; i--){
            prefixFromEnd[index2] = prefixFromEnd[index2 + 1] + arr[i];
            index2--;
        }

        System.out.println();
        System.out.print("From End : ");
        for(int Y : prefixFromEnd){
            System.out.print(Y + " ");
        }
        System.out.println();
        System.out.println("Pivot index : ");


    }
}