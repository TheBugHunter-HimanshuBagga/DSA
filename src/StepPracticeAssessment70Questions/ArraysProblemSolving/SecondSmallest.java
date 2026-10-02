package StepPracticeAssessment70Questions.ArraysProblemSolving;

public class SecondSmallest {// A4
    public static void main(String[] args) {

        int[] arr = {4, 1, 2, 1, 5};
        int FirstMinimum = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            FirstMinimum = Math.min(FirstMinimum, arr[i]);
        }
        System.out.println("My first minimum is: " + FirstMinimum);

        // Now remove that from the array and put all included values in newArr;

        int index = 0;
        for(int j = 0 ; j < arr.length ; j++){
            if(arr[j] != FirstMinimum){
                arr[index] = arr[j];// [[4] 0, [2] 1, [5] 2,[] 3]
                index++;
            }
        }

        System.out.print("arr: ");
        for(int X : arr){
            System.out.print(X + " ");
        }
        System.out.println("Index: "+ index);

        //put inside new Array
        int[] newArr = new int[index];
        int p = 0;
        for(int i = 0 ; i < newArr.length ; i++){
            newArr[p] = arr[i];
            p++;
        }

        if(newArr.length == 0){
            System.out.println(-1);
            return;
        }

        System.out.print("newArr: ");
        for(int Y : newArr){
            System.out.print(Y + " ");
        }

        int secondSmallest = Integer.MAX_VALUE;
        for(int k = 0 ; k < newArr.length ; k++){
            secondSmallest = Math.min(secondSmallest, newArr[k]);
        }
        System.out.println("The second smallest value is: " + secondSmallest);
    }
}
