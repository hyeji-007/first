package org.example.practice.java2.ch06;

public class Code83Pr {

    public static void main(String[] args) {
        int a = 2, b = 10;
        findPower(a,b);
    }

    public static void findPower(int x, int y) {
        int result = 1;
        for (int i = 1; i <= y; i++) {
            result *= x;
        }
        System.out.println(x + "의" + y + "제곱: " + result);
    }
}
