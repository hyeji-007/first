package org.example.practice.java1.ch05_1;

public class For05_5_1 {
    public static void main(String[] args) {
        /*
        1부터 10까지의 곱의 결과를 출력하는 프로그램을 for문을 이용해서 작성
         */

        int result = 1;
        for(int i = 1; i <= 10; i++) {
            result *= i;
        }
        System.out.println("result= " + result);
    }
}
