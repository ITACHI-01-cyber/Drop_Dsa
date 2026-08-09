import java.util.HashSet;
import java.util.*;

// Floyd’s Tortoise and Hare Algorithm (Cycle Detection in Linked List) +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

// class Node{
//     int data;
//     Node next;

//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }

// public class LLleet {
//     Node head;

//     void add(int data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }
//         Node temp = head;
//         while(temp.next != null){
//             temp = temp.next;
//         }
//         temp.next = new  Node(data);
//     }

//     void Print(){
//         Node current = head;
//         while (current != null) {
//         System.out.print(current.data +" -> ");
//             current = current.next;
//         }
//         System.err.println("NULL");
//     }

//     boolean hasCycle(){
//         Node Slow = head;
//         Node Fast = head;

//         while(Fast != null && Fast.next != null){
//             Slow = Slow.next;
//             Fast = Fast.next.next;

//             if(Slow == Fast){
//                 return true;
//             }
//         }

//         return false;
//     }
//         void createCycle(int index) {
//         Node tail = head;
//         Node cycleNode = null;
//         int i = 0;
//         Node cur = head;
//         while (cur.next != null) {
//             if (i == index) cycleNode = cur;
//             cur = cur.next;
//             i++;
//         }
//         if (i == index) cycleNode = cur;
//         cur.next = cycleNode; 
//     }
//     void PrintWithCycle() {

//         if (head == null) {
//             System.out.println("NULL");
//             return;
//         }
//         Node cycleStart = detectCycle();

//         Node current = head;
//         while (current != cycleStart) {
//             System.out.print(current.data + " -> ");
//             current = current.next;
//         }
//         System.out.print("[" + current.data + " -> ");
//         current = current.next;
//         while (current != cycleStart) {
//             System.out.print(current.data + " -> ");
//             current = current.next;
//         }
//         System.out.println("... cycle back to " + cycleStart.data + "]");
//     }

//     Node detectCycle() {
//         Node slow = head;
//         Node fast = head;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//             if (slow == fast) break;
//         }
//         if (fast == null || fast.next == null) return null;
//         slow = head;
//         while (slow != fast) {
//             slow = slow.next;
//             fast = fast.next;
//         }
//         return slow;
//     }
//     void main(){
//         LLleet list = new LLleet();
//         list.add(10);
//         list.add(20);
//         list.add(30);
//         list.add(40);
//         list.add(50);
//         list.add(60);
//         list.add(70);

//         list.Print();
      
//         list.createCycle(2); 

//         System.out.println("hasCycle: " + list.hasCycle());

//         Node start = list.detectCycle();
//         System.out.println("Cycle starts at: " + start.data);

//         System.out.print("With cycle:    ");
//         list.PrintWithCycle();
 
//     }
// }

// Cycle detection in the linked list +++++++++++++===================================>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

//  class Node{
//      int data;
//      Node prev;
//      Node next;

//      Node(int data ){
//          this.data = data;
//          this.next = null;
//          this.prev = null;
//      }
//  }

//  public class LLleet {
//      Node head;

//      void Add(int data){
//          Node newNode = new Node(data);
//          if (head == null){
//              head = newNode;
//              return;
//          }
//          Node temp = head;
//          while (temp.next != null){
//             temp = temp.next;
//          }
//          temp.next = newNode;
//      }

//      Node createCycle(int  pos){
//         if(head == null || pos < 0){
//             return head;
//         }
//         Node currnet = head;
//         Node cycleTarget = null;
//         int currentIndex = 0;

//         while (currnet.next != null) {
//             if(currentIndex == pos){
//                 cycleTarget = currnet;
//             }
//             currnet = currnet.next;
//             currentIndex++;
//         }
//         if(cycleTarget != null){
//             currnet.next = cycleTarget;
//             System.out.println("Cycle created! Tail node now points to node with value:" + cycleTarget.data);
//         }
//         else {
//             System.out.println(">> Invalid position. Cycle not created.");
//         }
//         return head;
//      }

//      boolean detectCycle(){
//         if(head == null || head.next == null){
//             return false;
//         }
//         Node slow = head;
//         Node fast = head;
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//             if(slow == fast){
//                 return true;
//             }
//         }
//         return false;
//      }

//      void print(){
//         Node current = head;
//         while(current != null){
//             System.out.print(current.data + " -> ");
//             current = current.next;
//         }
//         System.out.println("null");
//      }
//      void printSafe(Node startNode, int limit) {
//         Node current = startNode;
//         int count = 0;
        
//         while (current != null && count < limit) {
//             System.out.print(current.data + " -> ");
//             current = current.next;
//             count++;
//         }
//         System.out.println("... (and it keeps looping!)");
//     }

//      void main(){
//         LLleet list = new LLleet();
//         list.Add(10);
//         list.Add(20);
//         list.Add(30);
//         list.Add(40);
//         list.Add(50);
//         list.print();
//         Node cyclic =   list.createCycle(2);
//         System.out.println("Cycle detected? " + list.detectCycle());
//         list.printSafe(cyclic , 12);
//      }
//  }

// REVERSE A LINKED LIST WITH FOUR APPROACH 
//  FIRST :- The Standard Iterative Reversal ====================================>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

// class Node{
//     int data;
//     Node next;
    
//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }

// public class LLleet {
//     Node head;

//     void add(int data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }
//         Node temp = head;
//          while (temp.next != null) {
//             temp = temp.next;
//          }
//          temp.next = newNode;
//     }

//     void  reverse(){
//         Node prev = null;
//         Node curr = head;
    
//     while (curr != null) {
//         Node nextTemp = curr.next; 
//         curr.next = prev;              
//         prev = curr;                   
//         curr = nextTemp;               
//     }
//     this.head =  prev;
//     }

//     void Print(){
//         Node currrent = head;
//         while(currrent != null){
//             System.out.print(currrent.data + " -> ");
//             currrent = currrent.next;
//         }
//         System.err.println("Null");
//     }
//     void main(){
//         LLleet list = new LLleet();
//         list.add(10);
//         list.add(20);
//         list.add(30);
//         list.add(40);
//         list.add(50);
//         list.add(60);
//         list.Print();
//         list.reverse();
//         list.Print();
//     }
// }
// SECOND 2. The Standard Recursive Reversal
  //  This approach travels all the way to the end of the list using the call stack, 
  // and then reverses the pointers as the recursion "unwinds" and travels back to the beginning. +==============>>>>>>>>>

//   class Node{
//     int data;
//     Node next;
    
//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
//   }

//   public class LLleet {
//         Node head;
    
//     void add(int data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }
//         Node temp = head;
//         while (temp.next != null) {
//             temp = temp.next;
//         }
//         temp.next = newNode;
//     } 
//     Node reverseRecursion(Node head){
//         if(head == null || head.next == null){
//             return head;
//         }
//         Node newhead = reverseRecursion(head.next);
//         head.next.next = head;
//         head.next = null;
//         return newhead;
//     }
//     void Print(){
//         Node curr = head;
//         while(curr != null){
//             System.out.print(curr.data + " -> ");
//             curr = curr.next;
//         }
//         System.out.println("NULL");
//     }
//     void main(){
//         LLleet ll = new LLleet();
//         ll.add(1);
//         ll.add(2);
//         ll.add(3);
//         ll.add(4);
//         ll.Print();
//         ll.head = ll.reverseRecursion(ll.head);
//         ll.Print();
//     }
//   } 

// Reversing a Sublist (Reverse Linked List II)

//  This pattern reverses only a portion of the list, 
// from position left to position right. 
// It uses a clever "insertion" method to reverse the sublist in a single pass.===============================+++>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

// class Node{
//     int data;
//     Node next;
    
//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
//   }

//   public class LLleet {
//         Node head;
    
//     void add(int data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }
//         Node temp = head;
//         while (temp.next != null) {
//             temp = temp.next;
//         }
//         temp.next = newNode;
//     } 
//     Node ReverseSublit(int left, int right) {
//         if (head == null || left > right) {
//             return head;
//         }

//         // Create dummy node (data=0 doesn't matter)
//         Node dummy = new Node(0);
//         dummy.next = head;
//         Node prev = dummy;

//         // Move prev to just before left position
//         for (int i = 0; i < left - 1; i++) {
//             prev = prev.next;
//         }

//         Node start = prev.next;  // First node to reverse
//         Node then = start.next;  // Next node to process

//         // Reverse from left to right
//         for (int i = 0; i < right - left; i++) {
//             start.next = then.next;    // Remove 'then' from list
//             then.next = prev.next;     // Insert 'then' at start of reversed
//             prev.next = then;          // Update prev to new reversed start
//             then = start.next;         // Move to next node
//         }
//         return dummy.next;  // New head
//     }

//     void Print(){
//         Node curr = head;
//         while(curr != null){
//             System.out.print(curr.data + " -> ");
//             curr = curr.next;
//         }
//         System.out.println("NULL");
//     }
//     void main(){
//         LLleet ll = new LLleet();
//         ll.add(1);
//         ll.add(2);
//         ll.add(3);
//         ll.add(4);
//         ll.Print();
//         ll.ReverseSublit(2,4);
//         ll.Print();
//     }
//   } 


// FOURTH APPROACH 
//  USING K GRUP APPROACH FOR THIS REVERSALL ===================================>>>>>>>>>>>>>>>>>>>>>>>>>>>>.
    
//     class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }

// public class LLleet {
//     Node head;

//     void add(int data){
//         Node newnode = new Node(data);
//         if(head == null){
//             head = newnode;
//             return;
//         }
//         Node temp = head;
//         while(temp.next != null){
//             temp = temp.next;
//         }
//         temp.next = newnode;
//     }
//     void Print(){
//         Node curr = head;
//         while (curr != null) {
//             System.out.print(curr.data + " -> ");
//             curr = curr.next;
//         }
//         System.out.println("NULL");
//     }

//     Node kRev(Node head, int k) {
//         Node prev = null;
//         Node curr = head;
//         Node next;

//         for (int i = 0; i < k && curr != null; i++) {
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }
//         return prev; // new head of reversed k-group
//     }

//     // Reverse the list in groups of size k
//     Node reverseKGroup(Node head, int k) {
//         if (head == null || k <= 1) return head;

//         Node dummy = new Node(0);
//         dummy.next = head;
//         Node prevGroupTail = dummy; // tail of previous reversed group

//         while (true) {
//             // Check if at least k nodes exist from here
//             Node current = prevGroupTail;
//             for (int i = 0; i < k; i++) {
//                 current = current.next;
//                 if (current == null) {
//                     // Less than k nodes left → return result
//                     return dummy.next;
//                 }
//             }

//             Node groupHead = prevGroupTail.next;      // first node of this group
//             Node nextGroupHead = current.next;        // first node of next group

//             // Disconnect current group
//             current.next = null;

//             // Reverse this group of k nodes
//             Node newGroupHead = kRev(groupHead, k);   // use helper, not recursive reverseK

//             // Re-link: prevGroupTail → newGroupHead
//             prevGroupTail.next = newGroupHead;

//             // Original head (groupHead) is now the tail of reversed group
//             groupHead.next = nextGroupHead;

//             // Move tail pointer to this group's tail
//             prevGroupTail = groupHead;
//         }
//     }
    
//     void main(){
//         LLleet list = new LLleet();
//         list.add(20);
//         list.add(40);
//         list.add(60);
//         list.add(80);
//         list.add(100);
//         list.add(120);
//         list.Print();

//         list.head = list.reverseKGroup(list.head, 3);
//         list.Print();
//     }
// }

//  MERGEING LINKED LIST 
//  THREE TYPES OF LIST AND DIFFRENT MERGING IN THREE TYPES =
//  ->  1) Merge Two Sorted Lists , -> dOUBLY lINKED LIST , -> CIRCULAR LINKEDLIST

//  1) Merge Two Sorted Lists

// class Node{
//     int data;
//     Node next;

//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }

// public class LLleet {
//     Node head;

//     void add(int data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }
//         Node temp = head;
//         while (temp.next != null) {
//             temp = temp.next;
//         }
//         temp.next = newNode;
//     }
//     void print(Node head){
//         Node curr = head;
//         while (curr != null) {
//             System.out.print( curr.data + " -> ");
//             curr = curr.next;
//         }
//         System.out.println("Null");
//     }

//     Node MeregeTwoSortedList(Node list1, Node list2){
//         Node dummy = new Node(-1);
//         Node tail = dummy;

//         while(list1 != null && list2 != null){
//             if(list1.data <= list2.data){
//                 tail.next = list1;
//                 list1 = list1.next;
//             }else{
//                 tail.next = list2;
//                 list2 = list2.next;
//             }
//             tail = tail.next;
//         }
//         tail.next = (list1 != null)? list1 : list2;
//         return dummy.next;
//     }

//     void main(){
//         LLleet sol = new LLleet();
//         Node l1 = new Node(1);
//         l1.next = new Node(2);
//         l1.next.next = new Node(4);

//         Node l2 = new Node(1);
//         l2.next = new Node(3);
//         l2.next.next = new Node(4);

//         Node merge = sol.MeregeTwoSortedList(l1, l2);
//         sol.print(merge);
//     }
// }

// 2) Merge K Sorted Lists
// K sorted lists ko merge karo using priority queue (min-heap). Heap size K, time O(N log K).

import java.util.PriorityQueue;

// class Node{
//     int data;
//     Node next;
//     Node prev;

//     Node(int data){
//         this.data = data;
//         this.next = null;
//         this.prev = null;
//     }
// }

// public class LLleet {
// Node head;

//     void add(int data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }
//         Node temp = head;
//         while(temp.next != null){
//             temp = temp.next;
//         }
//         temp.next = newNode;
//         newNode.prev = temp;
//     }
//     void Print(Node node) {
//         System.out.print("List: ");
//         if (node == null) {
//             System.out.println("List is empty");
//             return;
//         }
//         while (node != null) {
//             System.out.print(node.data);
//             if (node.next != null) System.out.print(" <-> ");
//             node = node.next;
//         }
//         System.out.println(" <-> NULL");
//     }

//     Node mergeKLists(Node[] lists) {
//         PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.data - b.data);

//         for (Node node : lists) {
//             if (node != null) pq.offer(node);
//         }

//         Node dummy = new Node(-1);
//         Node tail = dummy;

//         while (!pq.isEmpty()) {
//             Node min = pq.poll();
//             tail.next = min;
//             tail = tail.next;

//             if (min.next != null) {
//                 pq.offer(min.next);
//             }
//         }
//         return dummy.next;
//     }

//     public static void main(String[] args) {
//         LLleet sol = new LLleet();

//         Node[] lists = new Node[3];

//         lists[0] = new Node(1);
//         lists[0].next = new Node(4);
//         lists[0].next.next = new Node(5);

//         lists[1] = new Node(1);
//         lists[1].next = new Node(3);
//         lists[1].next.next = new Node(4);

//         lists[2] = new Node(2);
//         lists[2].next = new Node(6);

//         sol.Print(lists[0]);

//         sol.Print(lists[1]);

//         sol.Print(lists[2]);

//         System.err.println("Merged: ");
//         Node merged = sol.mergeKLists(lists);
//         sol.Print(merged);  
//     }
// }

// 3) Merge In Between Lists
// Ek list me do positions ke beech dusri list insert kar =====================================>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LLleet {
    Node head;
    
    void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    
    void Print(Node node){  // Parameter add kiya
        Node curr = node;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("Null");
    }

    Node mergeInbW(Node list1, int a, int b, Node list2){
        Node start = list1;
        for(int i = 1; i < a; i++){
            start = start.next;
        }
        Node end = start;
        for(int i = a; i <= b; i++){
            end = end.next;
        }        
        start.next = list2;       
        Node temp = list2;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = end;       
        return list1;
    }

        void main(){
        LLleet sol = new LLleet();
        
        LLleet list1Obj = new LLleet();
        list1Obj.add(1);
        list1Obj.add(2);
        list1Obj.add(3);
        list1Obj.add(4);
        list1Obj.add(5);
        Node list1 = list1Obj.head;

        LLleet list2Obj = new LLleet();
        list2Obj.add(10);
        list2Obj.add(20);
        list2Obj.add(30);
        Node list2 = list2Obj.head;

        int a = 2;  
        int b = 3;  

        System.out.println("Before:");
        sol.Print(list1);
        
        Node ans = sol.mergeInbW(list1, a, b, list2);
        
        System.out.println("After:");
        sol.Print(ans);
    }
}