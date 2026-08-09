import java.util.*;

// SINGLY LINKED LIST IMPLEMENTATION IN JAVA

// class Node{
//     int data;    // value stored
//     Node next;   // pointer to next node

//     // CONSTRUCTOR
//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }

// public class ll01 {
//         Node head; // reference to first node (starts as null)

//     //  Add a new node at the END of the list
//         void add(int data){
//             Node newNode = new Node(data); // create new node
//             if(head == null){
//                 head = newNode;
//                 return;
//             }
//             // Traverse to the last node
//             Node last = head;
//             while (last.next != null){
//                 last = last.next;
//             }
//             last.next = newNode;
//         }

//     //  Print the entire list
//         void print(){
//                 Node current = head;
//                 while (current != null){
//                     System.out.print(current.data+" -> ");
//                     current = current.next;
//                 }
//                 System.out.println("NULL");
//         }

//     // Add at the beginning (O(1) time)
//         void addFirst(){
//             Node newNode = new Node(10);
//             newNode.next = head;   // new node points to old head
//             head = newNode;        // head now becomes new node
//         }
//         void main(){
//             ll01 list = new ll01();

//             list.add(20);
//             list.add(30);
//             list.add(40);
//             list.add(50);
//             list.addFirst();        // add at front
//             System.out.println("Singly Linked List:");
//             list.print();
//         }
// }

// SINGLY LINKED LIST OPREATION
    // 1. INSERTION => -> INSERTION AT BEGENING
//                      -> INSERTION AT END
//                      -> INSERTION AT SPECIFIC POSITION


//  INSETION AT BEGINING ================================================>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

// class Node{
//    int data;
//    Node next;

//    Node(int data){
//        this.data = data;
//        this.next = null;
//    }
// }

// public class ll01 {
//    Node head;

//    void add(int data){
//        Node newNode = new Node(data);
//        if (head == null){
//            head = new Node(data);
//            return;
//        }
//        Node Last = head;
//        while (Last.next != null){
//            Last = Last.next;
//        }
//        Last.next = new Node(data);
//    }

//    void Print(){
//        Node current = head;

//        while (current != null){
//            System.out.print(current.data + " -> ");
//            current = current.next;
//        }
//        System.out.println("NULL");
//    }

//    void  InsertionBeganing(int data){
//        Node newNode = new Node(data);
//        newNode.next = head;
//        head = newNode;
//    }
//    void main(){
//        ll01 List = new ll01();

//        List.add(20);
//        List.add(30);
//        List.add(40);
//        List.InsertionBeganing(10);
//        List.Print();
//    }
// }


// INSERTION AT END OF LIST ==================================================>>>>>>>>>>>>>>>>>>>>>>>>>>>

//class Node {
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//public class ll01 {
//    Node head;
//
//    void addLast(int data) {
//        Node newNode = new Node(data);
//
//        if (head == null) {
//            head = newNode;
//            return;
//        }
//        Node current = head;
//        while (current.next != null) {
//            current = current.next;
//        }
//        current.next = newNode;
//    }
//
//    void insertAtEnd(int data) {
//        addLast(data);
//    }
//
//    void print() {
//        Node current = head;
//        if (current == null) {
//            System.out.println("List is empty");
//            return;
//        }
//        while (current != null) {
//            System.out.print(current.data + " → ");
//            current = current.next;
//        }
//        System.out.println("null");
//    }
//        void main(String[] args) {
//        ll01 list = new ll01();
//
//        list.addLast(10);
//        list.addLast(20);
//        list.addLast(30);
//        list.addLast(40);
//        list.insertAtEnd(50);
//
//        list.print();
//    }
//}

// INSETION AT SPECIFIC POSITION =====================>>>>>>>>>>>>>>>>>

// InsertAtPosition.java
//class Node {
//    int data;
//    Node next;
//    Node(int data) { this.data = data; }
//}
//
//public class ll01 {
//    Node head;
//
//    boolean insertAtPosition(int pos, int data) {
//        if (pos < 0) return false;
//
//        Node newNode = new Node(data);
//
//        if (pos == 0) {
//            newNode.next = head;
//            head = newNode;
//            return true;
//        }
//
//        Node current = head;
//        int count = 0;
//
//        while (current != null && count < pos - 1) {
//            current = current.next;
//            count++;
//        }
//
//        if (current == null) return false;
//
//        newNode.next = current.next;
//        current.next = newNode;
//        return true;
//    }
//
//    void print() {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " → ");
//            temp = temp.next;
//        }
//        System.out.println("null");
//    }
//
//        void main(String[] args) {
//        ll01 list = new ll01();
//        list.head = new Node(10);
//        list.head.next = new Node(20);
//        list.head.next.next = new Node(40);
//
//        System.out.print("Before: ");
//        list.print();
//
//        list.insertAtPosition(2, 30);
//        list.insertAtPosition(0, 5);
//
//        System.out.print("After:  ");
//        list.print();   // 5 → 10 → 20 → 30 → 40 → null
//    }
//}

// Deltion of Node from starting

//class Node {
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//public class ll01 {
//    Node head;
//
//    void add(int data) {
//        Node newNode = new Node(data);
//
//        if (head == null) {
//            head = newNode;
//            return;
//        }
//
//        Node temp = head;
//        while (temp.next != null) {
//            temp = temp.next;
//        }
//        temp.next = newNode;
//    }
//
//    void deleteBeginning() {
//        if (head == null) {
//            System.out.println("List is empty! Nothing to delete.");
//            return;
//        }
//        head = head.next;
//        System.out.println("Node deleted from beginning.");
//    }
//
//    void print() {
//        if (head == null) {
//            System.out.println("List is empty.");
//            return;
//        }
//
//        Node current = head;
//        while (current != null) {
//            System.out.print(current.data + " -> ");
//            current = current.next;
//        }
//        System.out.println("NULL");
//    }
//
//        void main() {
//        Linked_List list = new Linked_List();
//
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//
//        System.out.println("Original List:");
//        list.print();
//
//        list.deleteBeginning();
//
//        System.out.println("\nAfter deleting from beginning:");
//        list.print();
//    }
//}

// DELETION FROM LAST OF LINKED LIST+++++++++++++++++++++++++++++++++++++++++++>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

//class Node {
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//public class ll01 {
//    Node head;
//
//    void add(int data) {
//        Node newNode = new Node(data);
//
//        if (head == null) {
//            head = newNode;
//            return;
//        }
//
//        Node temp = head;
//        while (temp.next != null) {
//            temp = temp.next;
//        }
//        temp.next = newNode;
//    }
//
//    void Print() {
//        if (head == null) {
//            System.out.println("List is empty.");
//            return;
//        }
//
//        Node current = head;
//        while (current != null) {
//            System.out.print(current.data + " -> ");
//            current = current.next;
//        }
//        System.out.println("NULL");
//    }
//
//    void DeleteLast() {
//        if (head == null) {
//            System.out.println("List is empty. Nothing to delete.");
//            return;
//        }
//
//        if (head.next == null) {
//            head = null;
//            System.out.println("Deleted the only node in the list.");
//            return;
//        }
//
//        Node temp = head;
//        while (temp.next.next != null) {
//            temp = temp.next;
//        }
//
//        temp.next = null;  // Remove the last node
//        System.out.println("Deleted node from the end.");
//    }
//
//        void main() {
//        ll01 l = new ll01();
//
//        l.add(10);
//        l.add(20);
//        l.add(30);
//        l.add(40);
//
//        System.out.println("BEFORE DELETION FROM LAST:");
//        l.Print();
//
//        l.DeleteLast();
//
//        System.out.println("\nAFTER DELETION FROM LAST:");
//        l.Print();
//    }
//}

// DELETE A NODE FROM SPECIFIC POSITION

// class Node{
//    int data;
//    Node next;

//    Node(int data){
//        this.data = data;
//        this.next = null;
//    }
// }

// public class ll01 {
//    Node head;

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
//            System.out.print(current.data + " -> ");
//            current = current.next;
//        }
//        System.out.println("NULL");
//    }

//    void DelSpecific(int key){

//        // if head itself hold the key
//        if (head.data == key){
//            head = head.next;
//            return;
//        }
//        Node temp = head;
//        Node prev = null;

//        while (temp != null && temp.data != key){
//            prev = temp;
//            temp = temp.next;
//        }
//        if (temp == null) {
//            System.out.println("Value " + key + " not found in the list.");
//            return;
//        }
//        // Unlink the node
//        prev.next = temp.next;
//        System.out.println("Deleted node with value " + key);
//    }

//    void main(){
//        ll01 l = new ll01();
//        l.add(10);
//        l.add(20);
//        l.add(30);
//        l.add(40);
//        l.add(50);
//        l.add(60);

//        l.Print();
//        l.DelSpecific(30);
//        l.Print();
//    }
// }

// SEARCH AN ELEMENT IN THE LINKED LIST

//    class Node{
//        int data;
//        Node next;

//        Node(int data){
//            this.data = data;
//            this.next = null;
//        }
//    }

//    public class ll01 {
//        Node head;

//        void add(int data){
//            Node newNode = new Node(data);
//            if (head == null){
//                head = newNode;
//                return;
//            }
//            Node temp = head;
//            while (temp.next != null){
//                temp = temp.next;
//            }
//            temp.next = new Node(data);
//        }
//        void Print(){
//            Node current = head;
//            while (current != null){
//                System.out.print(current.data + " -> ");
//                current = current.next;
//            }
//            System.out.println("NULL");
//        }
//        void Search(int key){
//            if (head == null){
//                return;
//            }
//            Node temp = head;
//            int position = 1;
//            while (temp != null){
//                if (temp.data == key){
//                    System.out.println("KEY:"+key + " FOUND AT: "+ position);
//                    return;
//                }
//                temp = temp.next;
//                position++;
//            }
//        }
//        void main(){
//            ll01 list = new ll01();
//            list.add(10);
//            list.add(20);
//            list.add(30);
//            list.add(40);
//            list.Print();
//            list.Search(30);

//        }
// }

// FINDING THE LENGTH OF THE LINKED LIST

//    class Node{
//    int data;
//    Node next;

//    Node(int data){
//        this.data = data;
//        this.next = null;
//    }
//    }

// public class ll01 {
//    Node head;

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
//    void Length(){
//        int count = 0;
//        Node temp = head;
//        while (temp != null){
//            temp = temp.next;
//            count++;
//        }
//        System.out.println("LENGTH OF LINKEDLIST IS: "+count);
//    }
//    void main(){
//        ll01 list = new ll01();

//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.Print();

//        list.Length();
//    }
// }

//  REVERSE A LINKED LIST +++++++++++++++++++++++++++++++>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

//    class Node{
//        int data;
//        Node next;

//        Node(int data){
//            this.data = data;
//            this.next = null;
//        }
// }

// public class ll01 {
//        Node head;

//        void add(int data){
//            Node newNode = new Node(data);
//            if (head == null){
//                head = newNode;
//                return;
//            }
//            Node temp = head;
//            while (temp.next != null){
//                temp = temp.next;
//            }
//            temp.next = new Node(data);
//        }
//        void Print(){
//            Node current = head;
//            while (current != null){
//                System.out.print(current.data +" -> ");
//                current = current.next;
//            }
//            System.out.println("NULL");
//        }
//    Node reverseList(Node head) {
//        Node prev = null;
//        Node curr = head;

//        while (curr != null) {
//            Node nextTemp = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = nextTemp;
//        }

//        return prev;
//    }
//        void main(){
//            ll01 list = new ll01();
//            list.add(10);
//            list.add(20);
//            list.add(30);
//            list.add(40);
//            System.out.println("NORMAL LINKED LIST: ");
//            list.Print();
//            list.head = list.reverseList(list.head);
//            System.out.println("REVERSED LINKED LIST: ");
//            list.Print();
//        }
// }

// FIND MIDDLE IN LINKED LIST +++++++++++++++++++++++++++>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

// class Node{
//    int data;
//    Node next;

//    Node(int data){
//        this.data = data;
//        this.next = null;
//    }
// }

// public class ll01 {
//    Node head;
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
//            System.out.print(current.data+" -> ");
//            current = current.next;
//        }
//        System.out.println("NULL");
//    }
//    Node Findmid(){
//        Node slow = head;
//        Node fast = head;

//        while (fast != null && fast.next !=null){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return slow;
//    }
//    void main(){
//    ll01 list = new ll01();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(50);

//        list.Print();
//        System.out.println("Middle (odd list): " + list.Findmid().data);
//    }
// }





















