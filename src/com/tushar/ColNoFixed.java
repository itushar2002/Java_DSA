package com.tushar;

public class ColNoFixed {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {4,5},
                {6,7,8}
        };
        int row, col;
      for (row = 0; row<arr.length;row++) {
          for (col = 0; col < arr[row].length; col++) {
              System.out.print(arr[row][col] + " ");
          }
          System.out.println();
      }

    }
}
