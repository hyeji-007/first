package org.example.practice.java2.ch06;

public class Code83 {

    public static void main(String[] args) {
        int a = 2, b = 10;
        findPower(a, b);
    }

    public static void findPower(int x, int y) { // 인수 2개를 받는다.
        int result = 1;
        for (int a = 1; a <= y; a++)
            result *= x;
        System.out.println(x + "의" + y + "제곱: " + result);
    }
}
