import java.util.*;
import java.util.Scanner;

// JAVA CODE FOR BASIC ARRAY REPRESENTAION AND ALSO DECLARATION OF THE ARRAY

//public class Array {
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("ENTER THE SIZE OF ARRAY:");
//        int n = sc.nextInt();
//
//        int[] a = new int[n];
//        System.out.println("ENTER THE ELEMENT:");
//        for (int i =0; i<n;i++){
//            a[i] = sc.nextInt();
//        }
//
//        System.out.println("THE ARRAY IS:");
//        System.out.println(Arrays.toString(a));
//
//    }
//}

// Traverse & print elements (for and for-each).

//    public class Array {
//        public static void main(String[] args){
//            int[] a = {10, 20, 30, 40, 50, 60, 70, 80};
//            for (int i = 0; i < a.length; i++){
//                System.out.println("THE ELEMENT OF THE ARRAY ARE: " + a[i]);
//            }
//            System.out.println("Array is:");
//            System.out.println(Arrays.toString(a));
//        }
//    }

//Reverse traverse (from n-1 to 0).

//    public class Array {
//        public static void main(String[] args){
//            int[] arr = {1,2,3,4,5,6};
//            int size = 10;
//            System.out.println("Array:");
//            System.out.println(Arrays.toString(arr));
//            for (int i = 5 ; i >= 0 ; i-- ){
//                System.out.print("[" +arr[i]+"]");
//            }
//        }
//}

//Sum and average of array elements.
//    public class Array {
//        public static void  main(String[] args){
//            int[] arr = {1,2,3,5,6};
//            float sum = 0;
//            for (int i = 0; i< arr.length;i++){
//                sum = sum + arr[i];
//            }
//            System.out.println("the sum is: "+ sum);
//            float average = sum / 2;
//            System.out.println("the average is : "+ average);
//        }
//}

//Find largest and smallest element in array.

//public class Array {
//    public static void main(String args[]){
//        int[] arr = {20,45,74,89};
//        int Largest = arr[0];
//        int samllest = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > Largest) {
//                Largest = arr[i];
//            }
//            if (arr[i] < samllest) {
//                samllest = arr[i];
//            }
//        }
//        System.out.println("The Largest element is: " + Largest);
//        System.out.println("The Smallest element is: " + samllest);
//
//    }
//}

//Check if array is sorted (non-decreasing).

//public class Array {
//    public static void main(String[] args) {
//        int[] arr = {1,2,23,55};
//        int sorted = arr[0];
//        boolean issorted = true;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    issorted = false;
//                    break;
//                }
//            }
//            if (issorted) {
//                System.out.println("sorted array");
//            } else {
//                System.out.println("Not sorted");
//            }
//        }
//    }
//}

//Count frequency of a given element.

//public class Array {
//    public static void main(String args[]){
//        int[] arr = {1,5,5,4,5,6};
//        int count = 0;
//        for (int i =0; i< arr.length;i++){
//            for (int j = i + 1; j<arr.length;j++){
//                if (arr [i] == arr[j]){
//                    count++;
//                    System.out.println("repeated leement is:"+arr[i]);
//                }
//            }
//        }
//        System.out.println("Frequency of repeating:"+count);
//    }
//}

//Linear search: return index of key or -1

//    public class Array {
//        public static void main(String[] args){
//            int[] arr = {1,2,3,4,5};
//            int key = 3;
//            for (int i = 0; i< arr.length;i++) {
//                if (arr[i] == key) {
//                    System.out.println(" THE KEY " + key + " FOUND At: " + i);
//                }
//                else{
//                    System.out.println("-1");
//                }
//            }
//        }
//}

// BUBBLE SORTING METHOD

//   public class Array {
//       public static void main(String args[]){
//           int[] arr = {34,2,12,24,80};
//           System.out.println("ARRAY IS:");
//           System.out.println(Arrays.toString(arr));
//        for (int i =0;i< arr.length - 1;i++){
//            boolean isSwapped = false;
//            for (int j = 0;j< arr.length - 1;j++){
//                if (arr[j] > arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                    isSwapped = true;
//                }
//            }
//            if (!isSwapped){
//                break;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//       }
//}

// SELECTION SORTING IN JAVA

//    public class Array {
//        public static void main(String args[]) {
//            int[] arr = {34, 2, 12, 24, 80};
//            System.out.println("ARRAY IS:");
//            System.out.println(Arrays.toString(arr));
//
//            for (int i = 0; i < arr.length - 1; i++) {
//                int min = i;
//                for (int j = i + 1; j < arr.length; j++)
//                    if (arr[j] < arr[min]) min = j;
//                int t = arr[i];
//                arr[i] = arr[min];
//                arr[min] = t;
//            }
//            System.out.println(Arrays.toString(arr));
//        }
//    }

// Insertion Sorting in java\

    public class Array {
        public static void main(String args[]){
            int[] arr = {56,23,43,13,6};
            int n = arr.length;
    System.out.println("ARRAY IS:");
    System.out.println(Arrays.toString(arr));
            for (int i =0;i<n;i++){
                int key = arr[i], j = i - 1;
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j]; j--;
                }
                arr[j + 1] = key;
            }
            System.out.println(Arrays.toString(arr));
        }
}