package stacks;

public class drill2 {
    static void main(String[] args) {
        // reverser string
        String st = "HIMANSHU";
        StringBuilder sb = new StringBuilder();
        for(int j = st.length() - 1; j >= 0 ; j--){
            sb.append(st.charAt(j));
        }
        String updated = sb.toString();
        for(int i = 0 ; i < updated.length() ; i++){
            System.out.print(updated.charAt(i));
        }
    }
}
