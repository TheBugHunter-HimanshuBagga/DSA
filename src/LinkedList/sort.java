package LinkedList;

public class sort {
    public static void main(String[] args) {
        Node n1 = new Node(2);
        Node n2 = new Node(4);
        Node n3 = new Node(1);
        Node n4 = new Node(3);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;
        Node head = n1;

        Node temp1 = head;
        while(temp1 != null){
            Node temp = head;
            while(temp != null && temp.next != null){
                if(temp.data > temp.next.data){ //2 < 4
                    int tempVal = temp.next.data;
                    temp.next.data = temp.data;
                    temp.data = tempVal;
                }
                temp = temp.next;
            }
            temp1 = temp1.next;
        }


        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
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
