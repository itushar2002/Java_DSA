package com.tushar;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        System.out.println("enter number 1 ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.println("enter number 2 ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of two number is " + sum);
    }
}
