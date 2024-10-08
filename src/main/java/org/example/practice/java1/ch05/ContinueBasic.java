package org.example.practice.java1.ch05;

public class ContinueBasic {

    /*
    100 이하의 자연수 중에서 5의 배수이자 7의 배수인 정수를 전부 출력 > num
    그 수를 세어서 출력 > count
    */

    public static void main(String[] args) {
        int num = 0;
        int count = 0;

        while((num++) < 100) {
            if(((num % 5) != 0) || ((num % 7) != 0)) {
                continue;
            }
            count++;
            System.out.println("num: " + num);
        }
        System.out.println("count: " + count);
    }
}
