package org.example.practice.ch05;

public class While05_4_3 {

    public static void main(String[] args) {
        /*
        1000 이하 자연수 중에서 2의 배수이자 7의 배수인 수를 출력하고, 그 수들의 합을 구해서 출력하는 프로그램을 while문을 이용해서 작성
         */

        int num = 1;
        int sum = 0;

        while(num <= 1000) {
            if((num % 2) == 0 && (num % 7) == 0) {
                System.out.println("num: " + num);
                sum += num;
            }
            num++;
        }
        System.out.println("sum: " + sum);
    }
}

