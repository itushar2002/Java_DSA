package com.tushar;

import java.util.Arrays;

public class SwapArr {
    public static void main(String[] args) {
        int[] arr = {1 , 4 , 5, 6, 7};
        System.out.println(Arrays.toString(arr));
        swap(arr,  1, 4);
        System.out.println(Arrays.toString(arr));
    }
    static  void swap(int[] arr , int index1, int index2 ) {
         int temp = arr[index1];
         arr[index1] = arr[index2];
         arr[index2] = temp;
    }


}
