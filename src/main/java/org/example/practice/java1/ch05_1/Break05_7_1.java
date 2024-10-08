package org.example.practice.java1.ch05_1;

public class Break05_7_1 {

    public static void main(String[] args) {
        /*
        구구단의 짝수 단인 2, 4, 6, 8단만 출력하는 프로그램
        2단은 2 x 2까지, 4단은 4 x 4까지, 6단은 6 x 6까지, 8단은 8 x 8까지 출력
         */
        for (int i = 2; i < 10; i +=2){
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));

                if (j >= i)
                    break;
            }
        }
    }
}
