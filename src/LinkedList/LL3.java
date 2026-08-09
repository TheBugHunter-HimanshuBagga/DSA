package LinkedList;

public class LL3 {
    public static void main(String[] args) {

        // insert Node at last

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = null;
        Node head = n1;

        Node lastNode = new Node(50);

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = lastNode;
        lastNode.next = null;

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
