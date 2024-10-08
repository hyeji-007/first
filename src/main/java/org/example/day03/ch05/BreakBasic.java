package org.example.day03.ch05;

public class BreakBasic {
    public static void main(String[] args) {
       //1~99까지 숫자 중에 5의 배수면서 7의 배수인 수 중 가장 낮은 숫자
       int num = 1;
       boolean search = false;

       while(num < 100) {
           if( (num % 5 == 0) && (num % 7 == 0) ) {
               search = true;
               break;
           }
           num++;
       }

       if(search) {
           System.out.println("찾는 정수: " + num);
       } else {
           System.out.println("5의 배수이자 7의 배수인 수를 찾지 못했습니다.");
       }
    }
}
