package org.example.practice.ch05;

public class ConBreak05_6_2 {

    public static void main(String[] args) {
        /*
        자연수 1부터 시작해서 모든 홀수를 더해 나감
        합이 언제 1000 넘어감?
        1000넘어선 값을 얼마?
         */
        int sum = 0;
        int num = 1;

        while(true) {
            if(num % 2 != 0) {
                sum += num;
            }

            if(sum > 1000) {
                System.out.println("num=" + num);
                System.out.println("sum=" + sum);
                break;
            }
            num++;
        }


    }
}
