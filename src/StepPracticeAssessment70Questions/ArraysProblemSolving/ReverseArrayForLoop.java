package StepPracticeAssessment70Questions.ArraysProblemSolving;

public class ReverseArrayForLoop { // A5
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = new int[arr.length];
        int index = 0;
        for(int i = arr.length - 1 ; i >= 0 ; i--){
            newArr[index] = arr[i];
            index++;
        }
        System.out.print("Reversed arr: ");
        for(int Y : newArr){
            System.out.print(Y + " ");
        }
    }
}
