import java.util.*;


// QUEUE implementation using JCF ++++++++++++++++++++++++++++++++++++++
//public class Q01 {
//    public static void main(String[] args) {
//        Queue<Integer> que = new LinkedList<>();
//        que.add(10);
//        que.add(20);
//        que.add(30);
//
//        System.out.println("Front :"+ que.peek() );
//        System.out.println("Removed :"+ que.poll());
//        System.out.println("Is Empty? :"+ que.isEmpty());
//        System.out.println("Queue :" + que);
//
//    }
//}

// QUEUE implementation using Array ++++++++++++++++++++++++++++++++++++++
// QUEUE implementation using Array
class QueueArray {
    private int[] arr;
    private int front, rear, capacity, count;

    QueueArray(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    // Enqueue
    public void enqueue(int x) {
        if (count == capacity) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = x;
        count++;
    }

    // Dequeue
    public int dequeue() {
        if (count == 0) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int x = arr[front];
        front = (front + 1) % capacity;
        count--;
        return x;
    }

    // Peek (front element)
    public int peek() {
        if (count == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    // Get rear element (last)
    public int getRear() {
        if (count == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[rear];
    }

    public boolean isEmpty() {
        return count == 0;
    }
    public void printQueue() {
        if (count == 0) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < count; i++) {
            int index = (front + i) % capacity;
            System.out.print(arr[index] + " ");
        }
        System.out.println();
    }
}

public class Q01 {
    public static void main(String[] args) {
        QueueArray q = new QueueArray(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.printQueue();

        q.dequeue();
        q.printQueue();

        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.printQueue();
    }
}

