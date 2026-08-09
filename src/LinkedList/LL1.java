package LinkedList;

public class LL1 {
    static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(40);
        Node head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = null;

        Node temp = head;
        int count = 0;
        while(temp != null){
           count++;
           temp  = temp.next;
        }
        System.out.println(count);
    }
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = next;
        }
    }
}
