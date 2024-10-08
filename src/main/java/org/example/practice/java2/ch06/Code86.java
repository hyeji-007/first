package org.example.practice.java2.ch06;

import java.util.Scanner;

public class Code86 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter one number: ");
        int a = scanner.nextInt();
        if (check(a) == true) {
            System.out.println(a + " is even number");
        } else {
            System.out.println(a + " is odd number");
        }
        scanner.close();
    }

    static boolean check(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }




}
