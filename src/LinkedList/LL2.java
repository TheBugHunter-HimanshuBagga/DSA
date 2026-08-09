package LinkedList;

public class LL2 {
    public static void main(String[] args) {
        // insert the Node in the beggining
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = null;
        Node head = n1;

        Node newNode = new Node(5);

        Node temp = head;
        head = newNode;
        newNode.next = temp;

        System.out.println(head);

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
