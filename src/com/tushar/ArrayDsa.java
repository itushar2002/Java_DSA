package com.tushar;

import java.util.Scanner;

public class ArrayDsa {
    public static void main(String[] args) {

        // Syntax
         // datatype [] var_name = new int[size]
      //   int [] arr = new int[5];
       // or
      //  int [] arr = {5,4,3,2,1};
        int [] arr = new int[5];
        //arr[0] = 1;
        //arr[1] = 5;
       // arr[2] = 4;
        //System.out.println();

    // input using loop

        Scanner in = new Scanner(System.in);
        for (int i = 0; i< arr.length; i++) {
        arr[i] = in.nextInt();
        }
        
//        for (int i = 0; i< arr.length; i++) {
//            System.out.println(arr[i] + " ");
//        }

        // alternatively using for each loop
        for (int num: arr) {
            System.out.print(num + "");
        }

    }
}
