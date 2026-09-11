package stacks;

public class st2 {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    Node top;

    void push(int val){
        Node newNode = new Node(val);

        // 30(Top) - 20 - 10 - null
        // 40(Top) - 30 - 20 - 10 - null

        newNode.next = top;
        top = newNode;
    }

    int pop(){
        if(top == null){
            System.out.println("STACK_UNDERFLOW");
            return -1;
        }
        // 30(Top) - 20 - 10 - null
        // 20(Top) - 10 - null
        int value = top.val;
        top = top.next;

        return value;
    }

     int peek(){
        if(top == null){
            System.out.println("Stack-isEmpty");
            return -1;
        }
        return top.val;
     }

     boolean isEmpty(){
        return top == null;
     }

    int size(){
        int count = 0;
        Node curr = top;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
