package arrays.SlidingWindow.Variable;

import java.util.HashMap;

public class drill8 {
    public static void main(String[] args) {
        String s = "eceba";
        int left = 0;
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        // Find the length of the longest substring containing at most 2 distinct characters
        for(int right  = 0 ; right < s.length() ; right++){
            char ch = s.charAt(right); // e
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }else{
                map.put(ch, 1);
            }

            if(map.size() > 2){
                char removed = s.charAt(left);
                map.put(removed, map.get(removed) - 1);
                if(map.get(removed) == 0){
                    map.remove(removed);
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        System.out.println(max);
    }
}
