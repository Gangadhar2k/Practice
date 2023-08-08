package DSA;
public class StackExample {
    int top;
    int capacity;
    int [] stack;
    StackExample(){
        top = -1;
        capacity=10;
        stack = new int[capacity];
    }


    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == capacity-1;
    }

    public int getTop() {
        return top;
    }

    public int push(int data){
        if(isFull()){
            System.out.println("Stack is Full");
        }
        else{
            return  stack[++top]= data;
        }
        return data;
    }

    public int pop(int data){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        else{
            return  stack[--top]= data;
        }
        return data;
//        return stack
    }


    public static void main(String[] args) {
        StackExample se = new StackExample();

        System.out.println(  se.push(50));
        System.out.println(  se.push(60));
        System.out.println(  se.push(70));

    }
}
