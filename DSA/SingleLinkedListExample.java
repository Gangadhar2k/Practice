package DSA;

public class SingleLinkedListExample {
    Node head;

    static class Node{
        int data;
        Node next = null;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void printsingle(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + "==>");
            current = current.next;
        }
        System.out.print("null");
    }


    public static void main(String[] args) {
        SingleLinkedListExample sl = new SingleLinkedListExample();
        sl.head = new Node(10);
        Node second = new Node(20);
        Node five = new Node (50);
        Node third = new Node(30);
        Node four = new Node(40);
        sl.head.next = second;
        second.next = five;
        five.next = third;
        third.next = four;
        sl.printsingle();
    }
}
