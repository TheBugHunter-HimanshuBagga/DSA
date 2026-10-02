package StepPracticeAssessment70Questions.ArraysProblemSolving;

public class ArraySum { // A1
    public static void main(String[] args) {
        // Return the sum of all elements
        int[] arr = {4, 7, 2, 9, 1};
        System.out.println(sum(arr));
    }
    public static int sum(int[] arr){
        int total = 0;
        for(int i = 0 ; i < arr.length ; i++    ){
            total += arr[i];
        }
        return total;
    }
}
