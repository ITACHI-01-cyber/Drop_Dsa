import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.StreamSupport;


//Two Sum (id: 1) – hashmap pattern.

//  TWO APPROACHES FOR THIS PROBLEM:-
// 1. BASIC FOR LOOP

//public class ArrayLeet {
//    public static void main(String[] args){
//        int[] arr = {2,4,8,9,4,6};
//        int target = 8;
//        int[] main = Twosum(arr,target);
//        System.out.println(Arrays.toString(main));
//    }
//    public static int[] Twosum(int[] arr, int target){
//        for (int i = 0; i < arr.length; i++){
//            for (int j = i + 1; j < arr.length; j++){
//                if(arr[i] + arr[j] == target){
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return new int[]{};
//    }
//}

// HASH MAP IN JAVA

//import java.util.HashMap;
//public class ArrayLeet {
//    public int[] two_sum(int[] nums,int target){
//        HashMap<Integer,Integer> numMap = new HashMap<>();
//        for (int i =0; i< nums.length;i++){
//            int complement = target - nums[i];
//            if(numMap.containsKey(complement)) {
//                return new int[] {numMap.get(complement), i};
//            }
//            numMap.put(nums[i],i);
//        }
//        return new int[] {};
//    }
//    public static void main(String[] args){
//        ArrayLeet solution = new ArrayLeet();
//        int[] nums = {2,7,11,15};
//        int target = 22;
//        int[] result = solution.two_sum(nums,target);
//        System.out.println(Arrays.toString(result));
//    }
//}

//Best Time to Buy and Sell Stock (121) – one pass, track min price.

// public class ArrayLeet {
//     public static int maxProfit(int[] prices) {
//         int minPrice = Integer.MAX_VALUE; // Initialize to largest possible value
//         int maxProfit = 0;

//         for (int i = 0; i < prices.length; i++) {
//             // Update minPrice if current price is lower
//             if (prices[i] < minPrice) {
//                 minPrice = prices[i];
//             }
//             // Calculate profit if selling today
//             else if (prices[i] - minPrice > maxProfit) {
//                 maxProfit = prices[i] - minPrice;
//             }
//         }
//         return maxProfit;
//     }
//      void main(String[] args) {
//         int[] prices = {7, 1, 5, 3, 6, 4};
//         int profit = maxProfit(prices);
//         System.out.println("Maximum Profit: " + profit); // Output: 5
//     }
// }

//Contains Duplicate s – set usage.

// TWO COMMON APPPROACH
// FIRST USING BASIC FOR LOOP , ABD SECOND USING HASHSET

// FIRST APPROACH

//public class ArrayLeet {
//    void main(){
//        int[] arr = {7, 1, 5, 7, 3, 6, 4};
//        check(arr);
//    }
//    void check(int[] arr){
//        for (int i = 0; i < arr.length; i++){
//            for (int j = i + 1; j< arr.length;j++){
//                if(arr[i] == arr[j]){
//                    System.out.println("FOUND DUPLICATE: "+ "index"+ i + " " +arr[i] + " " + arr[j]+ " " + "index" + j);
//                }
//            }
//        }
//    }
//}

// SECOND APPROACH HASH SET

// public class ArrayLeet {
//     void main(){
//         ArrayLeet sol = new ArrayLeet();
//         int[] nums = {1, 2, 3, 1};
//         System.out.println(sol.containsDuplicate(nums)); // true
//     }
//         public boolean containsDuplicate(int[] nums) {
//             // Step 1: Initialize an empty Set
//             Set<Integer> seen = new HashSet<>();
//             // Step 2: Iterate through each number
//             for (int num : nums) {
//                 // Step 3: Check if num is already in the Set
//                 if (seen.contains(num)) {
//                     return true;  // Duplicate found!
//                 }
//                 // Step 4: Add num to the Set (if not already present)
//                 seen.add(num);
//             }
//             // Step 5: No duplicates found after full traversal
//             return false;
//         }
//     }

//Remove Duplicates from Sorted Array (26) – two pointers.

// public class ArrayLeet {
//    void main(){
//        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
//        System.out.println("Original: " + Arrays.toString(arr));
//        int newLength = removeDuplicates(arr);
//        System.out.println("New length: " + newLength);
//        System.out.println("Modified: " + Arrays.toString(arr));
//    }
//     int removeDuplicates(int[] arr) {
//        if (arr.length == 0) return 0; // Edge case

//        int i = 0; // Slow pointer (tracks unique elements)
//        for (int j = 1; j < arr.length; j++) { // Fast pointer
//            if (arr[j] != arr[i]) {
//                i++;
//                arr[i] = arr[j]; // Overwrite duplicate
//            }
//        }
//        return i + 1;
//    }
// }

// //Maximum Subarray (53) – Kadane’s algorithm.

// public class ArrayLeet {
//     void main(){
//         int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//         int result = sumArr(nums);
//         System.out.println("Maximum Subarray Sum: " + result);
//     }
//     public static int sumArr(int[] nums){
//         int sum =0;
//         int max_sum = nums[0];
//         for (int i = 0;i < nums.length;i++){
//             sum = sum + nums[i];
//             if (sum > max_sum){
//                 max_sum = sum;
//             }
//             if (sum < 0){
//                 sum =0;
//             }
//         }
//         return max_sum;
//     }
// }

//Plus One (66) – carry handling.

// public class ArrayLeet {
//     void main(){
//     int[] arr ={1,2,9};
//     int[] result = Carry(arr);
//     System.out.println(Arrays.toString(result));
//     }
//     int[] Carry(int[] arr){
//         int n = arr.length;
//         for (int i = n - 1; i >= 0; i--) {
//             if (arr[i] < 9) {
//                 arr[i]++;  // Increment and return immediately
//                 return arr;
//             }
//             arr[i] = 0;
//         }
//         int[] newarr = new int[n + 1];
//         newarr[0] = 1; // First digit is 1, rest are 0 (initialized by Java)
//         return newarr;
//     }
// }

//Missing Number (268) – sum/xor approach.

// public class ArrayLeet {
//     public static void main(String[] args) {
//         // Correct test case for Missing Number (268)
//         int[] arr = {3, 0, 1}; // n=3, missing number=2
//         System.out.println("Missing number: " + missingNumber(arr)); // Output: 2
//     }

//     public static int missingNumber(int[] arr) {
//         int n = arr.length;
//         int result = n; // Critical: start with n
//         for (int i = 0; i < n; i++) {
//             result ^= i ^ arr[i];
//         }
//         return result;
//     }
// }

//Intersection of Two Arrays (349 / 350).

import java.util.*;

public class ArrayLeet {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 4, 5, 6};
        int[] num2 = {3, 4, 6, 2, 9};

        int[] result = intersect(num1, num2);
        System.out.println("Intersection: " + Arrays.toString(result));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        // Count frequencies in nums1
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums1) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        // Track intersection results
        List<Integer> result = new ArrayList<>();
        for (int num : nums2) {
            if (freqMap.getOrDefault(num, 0) > 0) {
                result.add(num);
                freqMap.put(num, freqMap.get(num) - 1);
            }
        }
        // Convert to int array
        return result.stream().mapToInt(i -> i).toArray();
    }
}
