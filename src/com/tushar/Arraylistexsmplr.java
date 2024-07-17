package com.tushar;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylistexsmplr {
    public static void main(String[] args) {
//      ArrayList<Integer> list = new ArrayList<Integer>(10);
////        list.add(23);
////        list.add(12);
////        list.add(54);
////        list.add(65);
////System.out.println(list);
////        list.set(0, 99);
////        System.out.println(list);
//        Scanner in = new Scanner(System.in);
//
//        for (int i = 0; i < 5; i++) {
//            list.add(in.nextInt());
//        }
//        System.out.println(list);
//


// Multidimension arraylist
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);
    }
}