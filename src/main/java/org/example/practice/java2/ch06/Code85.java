package org.example.practice.java2.ch06;

import java.util.Scanner;

public class Code85 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two integers : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = add(a,b);
        System.out.println(a + " + " + b + " = " + c);
        scanner.close();
    }

    static int add(int x, int y) { // add 메소드 정의
        int result = x + y;
        return result;
    }


}
