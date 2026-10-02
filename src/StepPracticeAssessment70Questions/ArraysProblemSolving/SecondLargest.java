package StepPracticeAssessment70Questions.ArraysProblemSolving;

public class SecondLargest {// A3
    public static void main(String[] args) {
        int[] arr = {10,10,10,10};
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            max = Math.max(max, arr[i]);
        }
        System.out.println("My max is: " + max);

        int index = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != max){
                arr[index] = arr[i];
                index++;
            }
        }
        int[] newArr = new int[index];
        int p = 0;
        for(int k = 0 ; k < newArr.length ; k++){
            newArr[p] = arr[k];
            p++;
        }
        if(newArr.length == 0){
            System.out.println(-1);
            return;
        }
        System.out.print("New Array is: ");
        for(int X : newArr ){

            System.out.print(X + " ");
        }
        System.out.println();
        int secondMax = Integer.MIN_VALUE;
        for(int j = 0 ; j < newArr.length ; j++){
            secondMax = Math.max(secondMax, arr[j]);
        }
        System.out.println("My second max is: " + secondMax);
    }
}
