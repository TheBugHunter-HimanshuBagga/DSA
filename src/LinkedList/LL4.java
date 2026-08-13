package LinkedList;

public class LL4 {
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node head  = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = null;

        int length = 0;
        Node curr = head;
        int k = 2;
        while(curr != null){
            length++;
            curr = curr.next;
        }
        // till here i go the length of this LL

        // now
        int index = length - k - 1;

        curr = head;

        for (int i = 0; i < index ; i++){
            curr = curr.next;
        }

        System.out.println(curr.next);
    }
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
}
