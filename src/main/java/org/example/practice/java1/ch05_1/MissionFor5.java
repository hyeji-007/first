package org.example.practice.java1.ch05_1;

public class MissionFor5 {

    public static void main(String[] args) {
        //for문을 활용하여 1~10 숫자를 전부 더한 값 출력
        int sum = 0;

        for(int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.printf("sum: %d\n", sum);
    }
}
