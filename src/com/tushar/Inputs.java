package com.tushar;

import java.util.Scanner;
public class Inputs {
    public static void main(String[] args) {
        System.out.println("please enter your roll no");
        Scanner input = new Scanner(System.in);
        int rollNo= input.nextInt();
        System.out.println("your roll no is " + rollNo);
    }
}
