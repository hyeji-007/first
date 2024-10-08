package org.example.day02.ch05;

public class BiggerValue {
    public static void main(String[] args) {
        int num1 = 5, num2 = -5;

        if((0 < num1 && num1 <= 100) && (0 < num2 && num2 <= 100)){

            System.out.println(num1 > num2 ? num1 : num2);

        } else {
            System.out.println("1-100사이의 값이 아닙니다.");
        }
        System.out.println("------");

        if(num1 < 1 || num1 > 100 || num2 < 1 || num2 > 100) {
            System.out.println("1-100사이의 값이 아닙니다.");
        } else {
            if(num1 > num2) {
                System.out.println(num1);
            } else {
                System.out.println(num2);
            }
        }
    }
}
