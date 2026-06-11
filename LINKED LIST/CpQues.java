//
//// class Node{
////     int data;
////     Node next;
////     Node(int data){
////         this.data = data;
////         this.next = null;
////     }
//// }
//
//// public class CpQues {
////     Node head = null;
////     void add(int data){
////         Node newNode = new Node(data);
////         if (head == null) {
////             head = newNode;
////             return;
////         }
////         Node temp = head;
////         while(temp.next != null){
////             temp = temp.next;
////         }
////         temp.next = newNode;
////     }
////     void Print(){
////         Node curr = head;
////         while (curr != null) {
////             System.out.print(curr.data+" -> ");
////             curr = curr.next;
////         }
////         System.out.println("Null");
////     }
//
////     Node FindMiddle() {
////         Node slow = head;
////         Node fast = head;
//
////         while (fast != null && fast.next != null) {
////             slow = slow.next;
////             fast = fast.next.next;
////         }
////         return slow;
////     }
//
////     void main() {
////         CpQues list = new CpQues();
////         list.add(10);
////         list.add(20);
////         list.add(30);
////         list.add(40);
////         list.add(50);
////         list.Print();
//
////         Node mid = list.FindMiddle();
////         if (mid != null) {
////             System.out.println("The middle element is: " + mid.data);
////         }
////     }
//// }
//
//
//// MERGING TWO SORTED LINKED list ======================================================================================================================
//
////class Node {
////    int data;
////    Node next;
////    Node(int x) { data = x; next = null; }
////}
////
////public class CpQues {
////
////    static Node mergeSort(Node head) {
////        if (head == null || head.next == null)
////            return head;
////
////        Node mid = getMiddle(head);
////        Node nextOfMid = mid.next;
////        mid.next = null;
////
////        Node left = mergeSort(head);
////        Node right = mergeSort(nextOfMid);
////
////        return merge(left, right);
////    }
////
////    static Node getMiddle(Node head) {
////        Node slow = head, fast = head.next;
////        while (fast != null && fast.next != null) {
////            slow = slow.next;
////            fast = fast.next.next;
////        }
////        return slow;
////    }
////
////    static Node merge(Node head1, Node head2) {
////        Node dummy = new Node(-1);
////        Node curr = dummy;
////
////        while (head1 != null && head2 != null) {
////            if (head1.data <= head2.data) {
////                curr.next = head1;
////                head1 = head1.next;
////            } else {
////                curr.next = head2;
////                head2 = head2.next;
////            }
////            curr = curr.next;
////        }
////
////        curr.next = (head1 != null) ? head1 : head2;
////        return dummy.next;
////    }
////
////    static Node sortAndMerge(Node head1, Node head2) {
////        head1 = mergeSort(head1);   // Sort list 1
////        head2 = mergeSort(head2);   // Sort list 2
////        return merge(head1, head2); // Merge both
////    }
////
////    static void printList(Node head) {
////        while (head != null) {
////            System.out.print(head.data + (head.next != null ? " -> " : "\n"));
////            head = head.next;
////        }
////    }
////
////        void main(String[] args) {
////        Node head1 = new Node(15);
////        head1.next = new Node(3);
////        head1.next.next = new Node(40);
////        head1.next.next.next = new Node(5);
////
////        Node head2 = new Node(20);
////        head2.next = new Node(2);
////        head2.next.next = new Node(10);
////
////        Node result = sortAndMerge(head1, head2);
////        printList(result);
////    }
////}
//
//
//// REVERSE A LINKED LIST +==================================================>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//
////class Node{
////    int data;
////    Node next;
////    Node(int data){
////        this.data = data;
////        this.next = null;
////    }
////}
////
////public class CpQues {
////    Node head = null;
////
////    void add(int data) {
////        Node newNode = new Node(data);
////
////        if (head == null) {
////            head = newNode;
////            return;
////        }
////        Node temp = head;
////        while (temp.next != null) {
////            temp = temp.next;
////        }
////        temp.next = newNode;
////    }
////
////    void Print() {
////        Node curr = head;
////        while (curr != null) {
////            System.out.print(curr.data + " -> ");
////            curr = curr.next;
////        }
////        System.out.print("NULL");
////    }
////
////    Node reverseList(Node head){
////        Node prev = null;
////        Node curr = head;
////        while (curr != null){
////            Node next = curr.next;
////            curr.next = prev;
////            prev = curr;
////            curr = next;
////        }
////        return prev;
////    }
////
////    void main(){
////        CpQues list = new CpQues();
////        list.add(10);
////        list.add(20);
////        list.add(30);
////        list.add(40);
////
////        System.out.println("Original List:");
////        list.Print();
////        System.out.println();
////
////        list.head = list.reverseList(list.head);
////
////        System.out.println("Reversed List:");
////        list.Print();
////    }
////}
//
//
//// REMOVE NTH NODE FROM A LINKED LIST
//
//// class Node{
////    int data;
////    Node next;
////    Node(int data){
////        this.data = data;
////        this.next = null;
////    }
////}
////
////public class CpQues {
////    Node head = null;
////
////    void add(int data) {
////        Node newNode = new Node(data);
////
////        if (head == null) {
////            head = newNode;
////            return;
////        }
////        Node temp = head;
////        while (temp.next != null) {
////            temp = temp.next;
////        }
////        temp.next = newNode;
////    }
////
////    void Print() {
////        Node curr = head;
////        while (curr != null) {
////            System.out.print(curr.data + " -> ");
////            curr = curr.next;
////        }
////        System.out.print("NULL");
////    }
////
////    public Node removeNthFromEnd(Node head, int n) {
////        Node dummy = new Node(0);
////        dummy.next = head;
////
////        Node fast = dummy;
////        Node slow = dummy;
////
////        for (int i = 0; i <= n; i++) {
////            fast = fast.next;
////        }
////
////        while (fast != null) {
////            fast = fast.next;
////            slow = slow.next;
////        }
////        slow.next = slow.next.next;
////        return dummy.next;
////    }
////
////    void main(){
////        CpQues list = new CpQues();
////        list.add(10);
////        list.add(20);
////        list.add(30);
////        list.add(40);
////
////        System.out.println("Original List:");
////        list.Print();
////
////        System.out.println(" ");
////        list.removeNthFromEnd(list.head,2);
////        list.Print();
////
////    }
////}
//
////  REODER LINKED LIST =============================================================================================
//
//class Node{
//    int data;
//    Node next;
//    Node(int data){
//        this.data = data;
//        this.next = null;
//    }
//}
//
//public class CpQues {
//    Node head = null;
//
//    void add(int data) {
//        Node newNode = new Node(data);
//
//        if (head == null) {
//            head = newNode;
//            return;
//        }
//        Node temp = head;
//        while (temp.next != null) {
//            temp = temp.next;
//        }
//        temp.next = newNode;
//    }
//
//    void Print() {
//        Node curr = head;
//        while (curr != null) {
//            System.out.print(curr.data + " -> ");
//            curr = curr.next;
//        }
//        System.out.print("NULL");
//    }
//
//    public void ReoderList(Node head){
//        if (head == null || head.next == null){
//            return;
//        }
//        // 1. Find the middle
//        Node slow = head;
//        Node fast = head;
//
//        while (fast.next != null && fast.next.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//
//        // 2. Reverse the second half
//        Node second = slow.next;
//        slow.next = null;
//
//        Node prev = null;
//        while (second != null) {
//            Node next = second.next;
//            second.next = prev;
//            prev = second;
//            second = next;
//        }
//
//        // 3. Merge first half and reversed second half
//        Node first = head;
//        second = prev;
//        while (second != null) {
//            Node temp1 = first.next;
//            Node temp2 = second.next;
//
//            first.next = second;
//            second.next = temp1;
//
//            first = temp1;
//            second = temp2;
//        }
//    }
//
//    void main(){
//        CpQues list = new CpQues();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//
//        System.out.println("Original List:");
//        list.Print();
//
//        System.out.println(" ");
//        list.ReoderList(list.head);
//        list.Print();
//
//    }
//}