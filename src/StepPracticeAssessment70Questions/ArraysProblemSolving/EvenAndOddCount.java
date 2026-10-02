package StepPracticeAssessment70Questions.ArraysProblemSolving;

public class EvenAndOddCount {// A6
    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 9, 6};
        int even = 0;
        int odd = 0;
        for(int i = 0 ; i < arr.length ; i++){
            int num = arr[i];
            if(num % 2 == 0){
                even++;
            }
            else odd++;
        }
        System.out.println("Even: " + even + ", " +"Odd: " + odd);
    }
}
