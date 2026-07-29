package iterative;

public class reverseCharacters {
    public static void main(String[] args) {
        char[] ch = {'h', 'e', 'l', 'l', 'o'};

        int left = 0;
        int right = ch.length - 1;

        while(right > left){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
        }
//
//        for(int right1 = ch.length - 1; right1 >= 0; right1--){
//            System.out.print(ch[right1]);
//        }

        System.out.println("NEW");
        for(char arr: ch){
            System.out.print(arr);
        }
        System.out.println();
        System.out.println("OLD");
        System.out.println(ch);
    }
}
