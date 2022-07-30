package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
        // write your code here


        Scanner scanner = new Scanner(in);

        System.out.print("A = ");
        int a = scanner.nextInt();
        System.out.print("B = ");
        int b = scanner.nextInt();
        System.out.print("C = ");
        int c = scanner.nextInt();

        if (a > b && a > c) {
            if (b > c) {
                System.out.println(a +" max "+ b);
            } else {
                System.out.println(a +" max "+ c);
            }

        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println(b +" max "+ a);

            } else {
                System.out.println(b +" max "+ c);
            }
        } else {
            if (a > b) {
                System.out.println(c +" max "+ a);
            } else {
                System.out.println(c +" max "+ b);
            }
        }
    }
}







