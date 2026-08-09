import javax.management.NotificationEmitter;
import java.util.*;

// practice linked list

// class node{
//     int data;
//     node next;

//     node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }

// public class Practice {
//     node head;

//     // add function to list
//     void add(int data){
//         Node newnode = new Node(data); // create new node
//         if(head == null){
//             head = new node(data);
//             return;
//         }
//         // Traverse to the last node
//         node last = head;
//         while (last.next != null){
//             last = last.next;
//         }
//         last.next = new node(data);
//     }

//     // Printing List
//     void print(){
//     node current = head;
//     while (current != null){
//         System.out.print(current.data + " -> ");
//         current = current.next;
//     }
//     System.out.println("NULL");
//     }

//     void  main(){
//         Practice list = new Practice();

//         list.add(10);
//         list.add(20);
//         list.add(30);
//         list.add(40);
//         list.print();

//     }
// }
// Insertion at begening end and specific position in Singly L.L

//class Node{
//    int data;
//    Node next;
//    Node(int data){
//        this.data = data;
//        this.next = null;
//    }
//}
//
//public class Practice {
//    Node head;
//
//    void add(int data){
//        Node newNode = new Node(data);
//        if (head == null){
//            head = newNode;
//            return;
//        }
//        Node temp = head;
//        while (temp.next != null){
//            temp = temp.next;
//        }
//        temp.next = new Node(data);
//    }
//    void Print(){
//        Node current = head;
//        while (current != null){
//            System.out.print(current.data +" -> ");
//            current = current.next;
//        }
//        System.out.println("NULL");
//    }
//    // Insert at begning
//    void InsertBeg(int data){
//        Node newNode = new Node(data);
//        Node temp = head;
//        head = new Node(data);
//        head.next = temp;
//    }
//    // Insert at specific position
//    boolean InsertSpec(int pos, int data) {
//        if (pos < 0) return false;
//        Node newNode = new Node(data);
//
//        Node current = head;
//        int count = 0;
//        while (current != null && count < pos - 1){
//            current = current.next;
//            count ++;
//        }
//        if (current == null){
//            return false;
//        }
//        newNode.next = current.next;
//        current.next = newNode;
//        return true;
//    }
//    // Insert at end of list
//    void InsertEnd(int data){
//        Node newNode = new Node(data);
//        Node current = head;
//        while (current.next != null){
//        current = current.next;
//    }
//        current.next = new Node(data);
//    }
//    void main(){
//        Practice list = new Practice();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(50);
//        list.Print();
//        list.InsertBeg(05);
//        list.Print();
//        list.InsertSpec(4,35);
//        list.Print();
//        list.InsertEnd(55);
//        list.Print();
//    }
//}

// deletion from last ,begening,specific

// class Node{
//     int data;
//     Node next;

//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }

// public class Practice {
//     Node head;
//     void add(int data){
//         Node newNode = new Node(data);
//         if (head == null){
//             head = newNode;
//             return;
//         }
//         Node temp = head;
//         while (temp.next != null){
//             temp = temp.next;
//         }
//         temp.next = new Node(data);
//     }
//     void Print(){
//         Node current = head;
//         while (current != null){
//             System.out.print(current.data+" -> ");
//             current = current.next;
//         }
//         System.out.println("NULL");
//     }
//     void deleteBeg(){
//         Node temp = head;
//         head = head.next;
//     }
//     void deleteEnd(){
//         Node temp = head;
//         while (temp.next.next != null){
//             temp = temp.next;
//         }
//         temp.next = null;
//     }
//     void deleteSpecific(int key){
//         Node temp = head;
//         Node prev = null;

//         while (temp != null && temp.data != key){
//             prev = temp;
//             temp = temp.next;
//         }
//         if (temp == null) {
//             System.out.println("Value " + key + " not found in the list.");
//             return;
//         }
//         // Unlink the node
//         prev.next = temp.next;
//     }
//     void main(){
//         Practice list = new Practice();
//         list.add(10);
//         list.add(20);
//         list.add(30);
//         list.add(40);
//         list.Print();
//         list.deleteSpecific(20);
//         list.Print();
//         list.deleteEnd();
//         list.Print();
//         list.deleteBeg();
//         list.Print();

//     }
// }