package com.tushar;

import java.util.Scanner;

public class Temperature_Prog {
    public static void main(String[] args) {
        System.out.print("Enter temperature in Celsius : ");
        Scanner input = new Scanner(System.in);
        float TempC = input.nextFloat();

        float TempF = (TempC * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit is : " + TempF);
    }
}







