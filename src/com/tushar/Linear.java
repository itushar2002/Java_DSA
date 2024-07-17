package com.tushar;

public class Linear {
    public static void main(String[] args) {
        int[] nums = {41, 5, 7, 45, 47, 66, 88, 99, 1023};
        int target = 41;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }


    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];
            if (target == elem) {
                return i;
            }

        }
        return -1;
    }
}