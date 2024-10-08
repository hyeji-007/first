package org.example.day03.ch05;

public class StringBasic {
    public static void main(String[] args) {
        //객체는 속성과 메소드로 이루어져 있다.
        String str = "안녕"; //String(대문자로 시작) > 참조 변수
        String str2 = new String("안녕"); //객체화했다.

        System.out.println("str: " + str);
        System.out.println("str2: " + str2);
        System.out.println("str == str2 : " + (str == str2));
        System.out.println( "str.equals(str2) : " + ( str.equals(str2)) );

        boolean isSame = ( str.equals(str2) );
        boolean isSame2 = ( str2.equals(str) );
        System.out.println(isSame);
    }
}
