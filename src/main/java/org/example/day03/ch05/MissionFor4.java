package org.example.day03.ch05;

public class MissionFor4 {

    public static void main(String[] args) {
        int dan = (int)(Math.random() * 8.0) + 2; //2 ~ 9 랜덤값
        System.out.println("dan=" + dan);

        /*
        for(int i = 1; i < 10; i++) {
            System.out.println(dan + " x " + i + " = " + (dan * i));
        }
        */

        // %d: 정수, %f: 실수, %c: 문자, %s: 문자열

        for(int i = 1; i < 10; i++) {
            System.out.printf("%d x %d = %d\n", dan, i, (dan * i));
        }
    }
}
