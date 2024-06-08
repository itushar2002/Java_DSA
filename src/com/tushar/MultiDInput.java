package com.tushar;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDInput {
    public static void main(String[] args) {

        int arr[][] = new int[3][3];
// Input of 2D array
        Scanner in = new Scanner(System.in);

        for (int row = 0; row<arr.length; row++) {
            // for column of each row
            for (int col = 0;col<arr[row].length;col++){
                arr[row][col] = in.nextInt();
            }
        }
      // output of 2D array
        // for (int row = 0; row<arr.length; row++) {
            // for column of each row
//            for (int col = 0;col<arr[row].length;col++){
//               // arr[row][col] = in.nextInt(); instead
//                System.out.print(arr[row][col] + " ");
//            }
         //   System.out.println(Arrays.toString(arr[row]));
          //  System.out.println();
   //     }
        // Inhanced for loop for 2d array output i.e foreach loop
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
