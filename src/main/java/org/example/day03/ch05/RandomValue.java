package org.example.day03.ch05;

public class RandomValue {

    public static void main(String[] args) {
        System.out.println( Math.random() ); // 0~0.9999999999, 1미만의 실수만 나온다.
        System.out.println( Math.random() * 6 );
        //0 ~ 6 미만

        int value = (int)(Math.random() * 6);
        System.out.println(value);
        System.out.println((int)(Math.random() * 6));


        System.out.println( (int)(Math.random() * 6) );
        //0 ~ 5 이하

        // 3 ~ 8 사이 랜덤값 만들고 싶다.
        System.out.println( (int)(Math.random() * 6) + 3 );

        //11 ~ 23 사이 랜덤값 만들고 싶다.
        // >> 0~12  +11
        System.out.println( (int)(Math.random() * 13.0) + 11 );

        }



}
