package org.example.practice.ch05;

public class While05_4_2 {

    public static void main(String[] args) {
        /* 1부터 100까지 출력하고 이어서 거꾸로 100에서 1까지 출력하는 프로그램
        단, while문과 do~while문을 한 번씩 사용
         */
        int i = 1;
        while (i <= 100) {
            System.out.println(i++);
        } do {
            System.out.println(--i);
        } while(i > 1);




    }
}
