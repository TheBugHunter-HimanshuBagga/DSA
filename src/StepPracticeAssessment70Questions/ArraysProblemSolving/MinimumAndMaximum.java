package StepPracticeAssessment70Questions.ArraysProblemSolving;

public class MinimumAndMaximum { // A2
    public static void main(String[] args) {
        int[] arr = {8, 3, 11, 2, 7};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            max = Math.max(max, arr[i]);
            min = Math.min(min , arr[i]);
        }
        System.out.println("The max is: " + max + " and the min is: " + min);
    }
}
