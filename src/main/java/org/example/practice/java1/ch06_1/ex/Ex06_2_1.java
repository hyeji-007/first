package org.example.practice.java1.ch06_1.ex;

public class Ex06_2_1 {

    public static void main(String[] args) {
        System.out.println("원의 넓이(2.4): " + calCircleArea(2.4));
        System.out.println("원의 둘레(2.4): " + calCircleRound(2.4));
    }

    public static double calCircleArea(double rad) {
        final double PI = 3.14;
        return rad * rad * PI;
    }

    public static double calCircleRound(double rad) {
        final double PI = 3.14;
        return rad * 2 * PI;
    }
}
