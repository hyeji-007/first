package org.example.practice.java2.ch06;

public class Code81 {

    public static void main(String[] args) {
        System.out.println("before show call");
        show(); //메소드 호출
        System.out.println("after show call");
    }

    public static void show() { //반환값 없음, 메소드 호출
        System.out.println("I am show method");
    }
}
