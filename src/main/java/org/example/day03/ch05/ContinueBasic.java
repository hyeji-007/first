package org.example.day03.ch05;

public class ContinueBasic {
    public static void main(String[] args) {
        for(int i = 0; i < 15; i++) {
            if(i == 9) {
                continue; //출력하지 않고 바로 조건식으로 이동함 (skip)
            }
            System.out.println(i);
        }
        System.out.println(" -- 끝 --");
    }
}
