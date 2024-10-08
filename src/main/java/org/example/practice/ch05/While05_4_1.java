package org.example.practice.ch05;

public class While05_4_1 {
    //1부터 99까지의 합을 구하는 프로그램을 작성하되 while문을 이용하여 작성

    public static void main(String[] args) {
        int n = 1;
        int sum = 0;

        while(n <= 99) {
            sum += n;
            n++;
        }
        System.out.println(sum);
    }
}
