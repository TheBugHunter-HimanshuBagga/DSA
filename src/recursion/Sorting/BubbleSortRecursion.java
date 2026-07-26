package recursion.Sorting;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        int arr[] = {4,3,2,1};
        helperBubbleSort(arr, arr.length-1 , 0);
        for (int num: arr){
            System.out.println(num);
        }
    }
    static void helperBubbleSort(int arr[], int row , int col){
        if(row == 0){
            return;
        }
        if(col < row){
            if(arr[col] > arr[col + 1]){
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }
            helperBubbleSort(arr, row, col+1);
        }else{
            helperBubbleSort(arr, row-1, 0);
        }
    }
}
