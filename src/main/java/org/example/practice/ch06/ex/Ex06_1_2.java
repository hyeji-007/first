package org.example.practice.ch06.ex;

public class Ex06_1_2 {

    public static void main(String[] args) {
        abs(5, 3);
        abs(-10,-2);
        abs(20,50);
    }

    public static void abs(int n1, int n2) {
        if (n1 > n2) {
            System.out.println(n1 - n2);
        } else {
            System.out.println(n2 - n1);
        }
    }
}
