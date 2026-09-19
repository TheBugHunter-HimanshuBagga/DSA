package arrays.TwoPOINTERS;

import java.util.ArrayList;

public class drill7 {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,4,4};
        int left = 0; // right -> searches and left -> Places the next unique element
        for(int right = 1 ; right < arr.length ; right++){

            if(arr[left] != arr[right]){
                left++;
                arr[left] = arr[right];
            }


//            if(arr[left] == arr[right]){
//                right++;
//            }
//            else{ // [1(L),1,2(R),2,3,4,4]
//                if(!listResult.contains(arr[right])){
//                    listResult.add(arr[right]);
//                    left = right;
//                }
//            }
        }
        for(int i = 0 ; i <= left ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
