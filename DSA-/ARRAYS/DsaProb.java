
// TWO SUM PROBLEM
//public class Array_01 {
//  public static void main(String args[]){
//        int target = 50;
//        int arr[] = {25,25,64,35};
//      boolean found = false;
//      for (int i = 0; i < arr.length; i++) {
//          for (int j = i + 1; j < arr.length; j++) {
//              if (arr[i] + arr[j] == target) {
//                  System.out.println("Found pair: " + arr[i] + " + " + arr[j] + " = " + target);
//                  found = true;
//              }
//          }
//      }
//      if (!found) {
//          System.out.println("No pair found for target " + target);
//      }
//  }
//}

// O(nLogn) approch for same problem

//public class Array_01 {
//
//    // Bubble sort method
//    public static int[] twosum(int[] nums, int target) {
//        int[][] pair = new int[nums.length][2];
//        for (int i = 0; i < nums.length; i++) {
//            pair[i][0] = nums[i];
//            pair[i][1] = i;
//        }
//        Arrays.sort(pair, (a,b) -> Integer.compare(a[0],b[0]));
//
//        int left = 0;
//        int right = nums.length-1;
//        while (left<right){
//            int sum = pair[left][0] + pair[right][0];
//
//            if (sum == target) {
//                // return original indices
//                return new int[]{pair[left][1], pair[right][1]};
//            } else if (sum < target) {
//                left++;
//            } else {
//                right--;
//            }
//        }
//
//        return new int[]{-1, -1}; // not found
//    }
//
//    public static void main(String[] args) {
//        int[] nums = {23,54,12,43,40};
//        int target = 52;
//
//        int[] result = twosum(nums, target);
//        System.out.println("Indices: " + result[0] + ", " + result[1]);
//    }
//        }

//___________________________________________________________________________________________________________________________

// && Rearrangement / movement

//Reverse an array (in-place, two pointers).

import java.lang.ref.Cleaner;
import java.util.Arrays;
import java.util.Scanner;

//public class dsa {
//    public static void main(String args[]) {
//        Scanner a = new Scanner(System.in);
//
//        //taking input from user
//        System.out.println("ENTER THE SIZE FOR ARRAY:");
//        int n = a.nextInt();
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = a.nextInt();
//        }
//        System.out.println("ORIGINAL ARRAY: " + Arrays.toString(arr));
//        reverseArray(arr);
//        System.out.println("REVERSED ARRAY: " + Arrays.toString(arr));
//    }
//        // reverse two POINTERS  technique
//        public static void reverseArray(int[] arr) {
//            int left =0;
//            int right = arr.length-1;
//
//            while (left < right){
//                int temp = arr[left];
//                arr[left] = arr[right];
//                arr[right] = temp;
//
//                left++;
//                right--;
//            }
//        }
//    }

//Move all zeroes to end (stable, two pointers).

//    public class dsa {
//        public static void main(String args[]) {
//            int[] arr = {0, 4, 3, 0, 5, 0, 3, 2, 5, 0, 9};
//            System.out.println(Arrays.toString(arr));
//            int j = 0;
//
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] != 0) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                    j++;
//                }
//            }
//            System.out.println(Arrays.toString(arr));
//        }
//    }

//Rotate array right by k steps (extra array, then in-place using reverse).

//public class dsa{
//        public static void main(String[] args) {
//            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//            int k = 3;
//
//            System.out.println(Arrays.toString(arr));
//            k = k % arr.length;
//            reverse(arr, 0, arr.length - 1);// 9,8,7,6,5,4,3,2,1
//            reverse(arr, 0, k - 1);// 7,8,9,6,5,4,3,2,1
//            reverse(arr, k, arr.length - 1);// 7,8,9,1,2,3,4,5,6
//
//            System.out.println( Arrays.toString(arr));
//        }
//        public static void reverse(int[] arr, int start, int end) {
//            while(start < end) {
//                int temp = arr[start];
//                arr[start] = arr[end];
//                arr[end] = temp;
//                start++;
//                end--;
//            }
//        }
//    }

// && Searching / counting
//Find second largest element.

import java.util.Arrays;

//public class dsa {
//    public static void main(String[] args){
//        int[] arr = {32,23,44,10,4,78};
//        System.out.println(Arrays.toString(arr));
//
//        int firstLarge = arr[0];
//        int secondLarge = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > firstLarge) {
//                secondLarge = firstLarge;
//                firstLarge = arr[i];
//            }
//            else if (arr[i] > secondLarge && arr[i] != firstLarge) {
//                secondLarge = arr[i];
//            }
//        }
//        System.out.println("First largest: " + firstLarge);
//        System.out.println("Second largest: " + secondLarge);
//    }
//}

//Count number of occurrences of each element (use HashMap in Java).
import java.util.HashMap;
//public class dsa {
//    public static void main(String[] args) {
//
//        HashMap<Integer, Integer> hashMap = new HashMap<>(); // hash map declaration
//
//        int[] elements = {1, 2, 3, 4, 5, 5, 4, 5};
//        for (int element : elements) {
//            hashMap.put(element, hashMap.getOrDefault(element, 0) + 1);
//        }
//
//        System.out.println("Occurrences of 4: " + hashMap.getOrDefault(4, 0));
//        System.out.println("Occurrences of 5: " + hashMap.getOrDefault(5, 0));
//    }
//}
//Find missing number from 0..n or 1..n.

//    public class dsa {
//        public static void main(String[] args) {
//            int[] nums = {0, 1, 2, 1};
//
//            int n = nums.length - 1;
//            int result = 0;
//            for (int num : nums) {
//                result ^= num;
//            }
//            for (int i = 0; i <= n; i++) {
//                result ^= i;
//            }
//            System.out.println(result);
//        }
//}

// public class DsaProb {
//     public static void main(String[] args) {
//         int[] nums = {4, 1, 2, 1, 2};
//         System.out.println(singleNumber(nums));
//     }
//     public static int singleNumber(int[] nums) {
//         int result = 0;
//         for (int num : nums) {
//             result ^= num;
//         }
//         return result;
//     }
// }
