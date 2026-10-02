package StepPracticeAssessment70Questions.FrequencyDuplicatesMissingAndRearrangement;

public class RemoveDuplicatesFromSortedArray {// A12
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3};
        int left = 0;
        for(int right = 1 ; right < arr.length ; right++){
            if(arr[right] != arr[left]){
                left++;
                arr[left] = arr[right];
            }
        }
        System.out.println(left);

        int[] newArr = new int[left + 1];
        for(int k = 0 ; k < newArr.length ; k++){
            newArr[k] = arr[k];
        }

        System.out.println("arr: ");
        for(int X : arr){
            System.out.print(X + " ");
        }
        System.out.println();
        System.out.println("newArr: ");
        for(int Y : newArr){
            System.out.print(Y + " ");
        }
    }
}
