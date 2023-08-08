package DSA;

public class QueueExample {
    int [] queue = new int[5];
    int size,rear,front;
    public void enqueue(int data){
        queue[rear] = data;
        rear = rear+1;
        size = size+1;
    }

    public void show(){
        System.out.print("elements::");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[i]+" ");
        }
    }

    public static void main(String[] args) {
        QueueExample q =new QueueExample();
        q.enqueue(12);
        q.enqueue(4);
        q.enqueue(52);
        q.show();

    }
}
