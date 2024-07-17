package com.tushar;

public class BS {
    public static void main(String[] args) {
      int[] arr = {2,4,6,9,11,12,14,20,36,48};
      int target = 11;
      int ans =  binarySearch(arr, target);
        System.out.println(ans);
    }


    // return the index of target element
    // return -1 if element not found
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid; // Element found
            }
        }
      return -1;
    }
}