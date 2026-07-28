package iterative;

public class fibbo {
    public static void main(String[] args) {
        // if input is 4 then 0 , 1, 1, 2, 3 on this 4th index value is 3 hence iot should return this full list until the input index
        int n = 4;
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        while(n > 0){
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;

            n--;
        }

    }
}
