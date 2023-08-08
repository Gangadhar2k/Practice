package DSA;

class Node{
    int data;
    Node next;
    Node prev;
public Node(int data){
    this.data = data;
    this.next=null;
    this.prev = null;
}

}


public class doubleLinkedList {
Node head;
Node tail;
public doubleLinkedList(){
    this.head = null;
    this.tail = null;
}

public void append(int data){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        tail = newNode;
    }else{
        tail.next = newNode ;
        newNode.prev = tail;
        tail = newNode;
    }
}

public void ForwardTraversal(){
    Node current = head;
    while(current != null){
        System.out.print(current.data+ " ");
        current = current.next;
    }
    System.out.println();
}

    public void ReversalTraversal(){
        Node current = tail;
        while(current != null){
            System.out.print(current.data+ " ");
            current = current.prev;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        doubleLinkedList dl = new doubleLinkedList();
        dl.append(1);
        dl.append(2);
        dl.append(3);
        dl.append(4);
        dl.append(5);
        System.out.println("Forward Traversal");
        dl.ForwardTraversal();
        System.out.println("Reverse Traversal");
        dl.ReversalTraversal();

    }
}