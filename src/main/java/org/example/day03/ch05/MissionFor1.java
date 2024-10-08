package org.example.day03.ch05;

public class MissionFor1 {
    public static void main(String[] args) {
        //안녕 5번 출력
        for(int i = 9; i < 14; i++) {
            System.out.println("안녕");
        }
        System.out.println("--------");

        for(int z = 0; z < 14; z += 3) {
            System.out.println("안녕");
        }
        System.out.println("--------");

        //Hello 4번
        for(int i = 11; i > 7; i--) {
            System.out.println("Hello");
        }
    }
}
