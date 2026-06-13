import java.util.*;

// IMPLEMENTATION OF QUEUE USING AN ARRAY =============================================================>>>>>>>>>>>>>>>>>>>

public class REV{
    int[] arr;
    int front,rear,capacity;

    public REV(int size){
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
    }
    public boolean isFul(){
        return rear == capacity - 1;
    }
    public boolean isEmpty(){
        return front > rear;
    }
    void enqueue(int item){
        if(isFul()){
            System.out.println("Queue Overflow!!!");
            return;
        }
        arr[++rear] = item;
        System.out.println(item + "inserted into queue");
    }
    void dequeue(){
        if (isEmpty()){
            System.out.println("Queue is Empty ");
        }
        else {
            System.out.println("Front Element" + arr[front]);
        }
    }
    void peek(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
        }
        else{
            System.out.println("Front element: " +arr[front]);
        }
    }
    void display(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
        }
        else{
            System.out.println("Queue Element :");
            for (int i = front; i <= rear;i++){
                System.out.println(arr[i] + " ");
            }
            System.out.println();
        }
    }
       public static void main(String args[]){
        REV q = new REV(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.peek();
        q.display();
    }
}

