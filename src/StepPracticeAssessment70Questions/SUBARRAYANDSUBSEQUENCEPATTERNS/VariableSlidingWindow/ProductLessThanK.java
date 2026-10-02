package StepPracticeAssessment70Questions.SUBARRAYANDSUBSEQUENCEPATTERNS.VariableSlidingWindow;

public class ProductLessThanK {
    public static void main(String[] args) {
        int[] arr = {10,5,2,6};
        int k = 100;
        int productLessThanK = 0;
        int product = 1;
        int left = 0;
        for(int right = 0 ; right < arr.length ; right++){
            int num = arr[right];
            product = product * num;
            while(product >= k){
                product = product / arr[left];
                left++;
            }
            productLessThanK += right - left + 1;// 1,3,5,8
        }
        System.out.println(productLessThanK);
    }
}
