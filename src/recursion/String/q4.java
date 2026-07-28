package recursion.String;

import java.util.ArrayList;

public class q4 {
    public static void main(String[] args) {
        String str = "abcd";
        ArrayList<String> list = new ArrayList<>();
        list.add("");
        for(int i=0 ; i < str.length() ; i++){
            char ch = str.charAt(i); // a
            int size = list.size();
            for(int j = 0; j < size; j++){
                String current = list.get(j);
                list.add(current+ch);
            }
        }
        System.out.println(list);
    }
}
