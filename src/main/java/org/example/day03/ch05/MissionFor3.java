package org.example.day03.ch05;

public class MissionFor3 {

    public static void main(String[] args) {
        //0.0 ~ 0.9999
        int star = (int)(Math.random() * 7.0) + 2; //2~8 사이의 랜덤값
        System.out.println("star: " + star);
        System.out.println("----------");

        //나온 숫자만큼 *이 옆으로 출력되도록 해주세요.
        //star: 5
        //*****

        //star: 3
        //***

        for (int i = 0; i < star; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            System.out.print("*");
        }
    }
}
