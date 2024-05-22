package com.tushar;
// Type conversion :

/* when one type of data is assigning to another type of variable
    than automatic type conversion takes place if it matches the following condition:

    1: Types should be compatible ,
    2: Destination type should be greater than the source value
     (eg : float > int therefore automatic  Typeconveresion possible)


// Type Casting
   " If the destination is smaller than source (narrow conversion) (eg: float to int)
    than Type Casting takes places "


// Automatic type promotion in expression :
   // conversion of a smaller data type to a larger data type during arithmetic operations.
   This helps in preventing data loss and maintaining the consistency of the operations.
  */
public class Casting {

  public static void main(String[] args) {
   // Automatic Type Conversion
      // System.out.println("Enter Number : ");
      // Scanner input = new Scanner(System.in);
      // int a = input.nextInt();
      // int b = input.nextInt();   // float c = a + b;
      // System.out.println(c);

    // Type Casting
//  int num =  (int)(74.14f);
//  System.out.println(num);


    // Automatic type promotion in expression
//
//    byte a = 40;
//    byte b = 50;
//    byte c = 100;
    // 40 * 50 = 2000 , which can not be stored in a byte.
    // (byte range is =< 256 ) but it automatically promotes the output into integer
//    int d = a * b / c; // therefore answer becomes 20 due to automatic promotion during expression

    // eg- 2
    // Since java follows unicode value
//    int num  = 'A'; // letter stored in interger return its unicode value for 'a' = 40 , 'A' = 97
//    System.out.println(d);
//    System.out.println(a); // due to this java can print every character and
    // every value of any language weather its hindi, chinease or any language

 /* Rules for Type Promotion

  1) all the byte short and char is promoted to int
  2) If any of the operand( + - * /) is converted in to final value's datatype (ie, long , double, int etc
  */
// Example to understand Rule of type promotion :-
       byte b = 42;
       char c = 'a';
       short s = 1024;
      int i = 5000;
     float f = 50.4f;
     double d = 0.1234;
     double r = (b*c) + (c-s) / (f*d);
    System.out.println(r);
}
}