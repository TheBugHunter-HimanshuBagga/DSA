package LinkedList;

public class CCL2 {
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node head = n1;

        n1.next = n2;
        n2.next = n3;
        n3.next = n1;

        int count = 0;
        Node temp = head;
        do{
            count++;
            temp = temp.next;
        }while(temp != head);

        System.out.println("Length: " + count);
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
