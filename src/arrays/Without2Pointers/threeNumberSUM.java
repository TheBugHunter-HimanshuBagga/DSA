package arrays.Without2Pointers;

public class threeNumberSUM {
    public static void main() {
        int[] arr = {-4,-1,-1,0,1,2};
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i + 1 ; j < arr.length ; j++){
                for(int k = j + 1 ; k < arr.length ; k++){
                    if(arr[i] + arr[j] + arr[k] == 0){
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    }
                }
            }
        }
    }
}
