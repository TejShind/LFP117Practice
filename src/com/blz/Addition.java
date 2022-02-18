package com.blz;

import java.util.Scanner;

public class Addition {
    public static void main(String args[]) {

        Scanner sc = new Scanner ( System.in);
        System.out.println ("Please enter the number");
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();

        //int a = 10, b = 20;
        int d = a + b +c ;
        System.out.println("The sum of numbers is: Number a , Number b  and Number c  " + d);
    }
}
