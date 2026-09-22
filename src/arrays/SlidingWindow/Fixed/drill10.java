package arrays.SlidingWindow.Fixed;

import java.util.ArrayList;
import java.util.HashSet;

public class drill10 {
    public static void main(String[] args) {
        String s = "aababcabc";
        int k = 3;

        // find the number of distinct character for window size k
        int left = 0;
        int maxDistinct = 0;
        ArrayList<Character> list = new ArrayList<>();
        HashSet<Character> set = new HashSet<>();
        for(int right = 0 ; right < s.length() ; right++){
            char ch = s.charAt(right);
            list.add(ch);
            if(list.size() == k){

                set.clear();
                for(int i = 0 ; i < list.size() ; i++){
                    set.add(list.get(i));
                }
                maxDistinct = 0;
                for(int x : set){
                    maxDistinct++;
                }
                System.out.print(maxDistinct + " ");

                list.remove(left);
            }
        }
    }
}
