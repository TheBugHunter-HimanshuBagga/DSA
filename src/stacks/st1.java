package stacks;

public class st1 {


    int[] stack;
    int top;

    st1(int size){
        stack = new int[size];
        top = -1;
    }

    void push(int value){
        if(top == stack.length - 1){
            System.out.println("Over-Flow");
            return;
        }
        top++;
        stack[top] = value;
    }

    int pop(){
        // if empty
        if(top == -1){
            System.out.println("Under-Flow");
            return -1;
        }
        int value = stack[top];
        top--;

        return value;
    }

    // Peek
    int peek(){
        if(top == -1){
            System.out.println("Stack is empty!!");
            return -1;
        }
        // if not empty then
        int value = stack[top];

        return value;
    }

    boolean isEmpty(){
        return top == -1;
    }

    int size(){
        return top + 1;
    }

    public static void main(String[] args) {
        st1 stack = new st1(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.push(40);
        System.out.println("Size: " + stack.size());

        System.out.println("Push Element: 40");

        System.out.println("Popped: " + stack.pop());

        System.out.println("Top element: " + stack.peek());

        System.out.println("Size: " + stack.size());

        System.out.println("Is Empty: " + stack.isEmpty());
    }
}
