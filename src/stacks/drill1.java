package stacks;

import java.util.Stack;

// Implementing All Stack operations

public class drill1 {

    // stack has a top
    int[] stack;
    int top;

    drill1(int size) {
        stack = new int[size];
        top = -1;
    }

    // PUSH
    void push(int value) {
        if(top == stack.length - 1){
            System.out.println("OVER_FLOW");
            return;
        }
        top++;
        stack[top] = value;
    }

    // POP
    int pop(){
        if(top == -1){
            System.out.println("UNDER_FLOW");
            return -1;
        }
        int value = stack[top];
        top--;

        return value;
    }

    // PEEK
    int peek(){
        if(top == -1){
            System.out.println("UNDER_FLOW");
            return -1;
        }
        return stack[top];
    }

    // isEmpty
    boolean isEmpty(){
        return top == -1;
    }

    int size(){
        return top + 1;
    }


    static void main(String[] args) {
        drill1 stack = new drill1(5);

        stack.push(4);
        stack.push(5);

        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
    }
}
