package recursion.String;

public class q1 {
    public static void main(String[] args) {
        String str = "baccad";
        // remove all the ouccerences of a
        StringBuilder ans = new StringBuilder();
        String ans1= removeA(str, 0, "");
        System.out.println(ans1);
    }
//    static StringBuilder removeASB(String str, int index, StringBuilder ans){
//        if(index == str.length()){
//            return ans;
//        }
//        char ch = str.charAt(index);
//        if(ch != 'a'){
//            ans.append(ch);
//        }
//        return removeA(str, index+1, ans);
//    }

    static String removeA(String str, int index, String ans1){
        if(index == str.length()){
            return ans1;
        }
        char ch = str.charAt(index);
        if(ch != 'a'){
            ans1 = ans1 + ch;
        }
        return removeA(str, index+1, ans1);
    }
}
