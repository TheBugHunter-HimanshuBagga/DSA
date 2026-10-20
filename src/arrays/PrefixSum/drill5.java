package arrays.PrefixSum;

public class drill5 {
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};
        // to find the Equilibrium Index
        int[] prefixFromStart = new int[arr.length];
        int index = 0;

        prefixFromStart[index] = arr[0];
        index++;

        for(int i = 1 ; i < arr.length ; i++){
            prefixFromStart[index] = prefixFromStart[i - 1] + arr[i];
            index++;
        }
        System.out.print("From Front: ");
        for(int X : prefixFromStart){
            System.out.print(X + " ");
        }

        int[] prefixFromEnd = new int[arr.length];
        int index1 = arr.length - 1;

        prefixFromEnd[index1] = arr[arr.length - 1];
        index1--;

        for(int i = arr.length - 2 ; i >= 0; i--){
            prefixFromEnd[index1] = prefixFromEnd[index1 + 1] + arr[i];
            index1--;
        }
        System.out.println();
        System.out.print("From Back: ");
        for(int Y : prefixFromEnd){
            System.out.print(Y + " ");
        }

        System.out.println();
        System.out.print("Equilibrium/Pivot : ");
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            int leftSum = 0;
            int rightSum = 0;
            if(i > 0){
                leftSum = prefixFromStart[i - 1];
            }

            if(i < arr.length - 1){
                rightSum = prefixFromEnd[i + 1];
            }

            if(leftSum == rightSum){
                System.out.print(i);
                break;
            }
        }

    }
}
