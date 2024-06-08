package com.tushar;

// A Function is a block of code which can be reused whenever called;
// Syntax of a function :-
    // returnType Name_of_Function(params) {
                //body
           // return
               //  }
   // name of function(arguments)        this is

public class Fnc {
//    public static void main(String[] args) {
//        sum();
//        sum();
//        sum();
//        sum();
//        sum();
//        sum();
//    }
//
//    static  void sum() {
//        int num1, num2, sum;
//        System.out.println("Enter Num one");
//        Scanner input = new Scanner(System.in);
//        num1 = input.nextInt();
//        System.out.println("Enter Num Two");
//        num2 = input.nextInt();
//        sum = num1 + num2;
//        System.out.println("Sum of the given numbers is : " + sum);
//    }
//
//
//
public static void main(String[] args) {
      int ans =   sum(80,20);
    System.out.println(ans);
}

    static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
