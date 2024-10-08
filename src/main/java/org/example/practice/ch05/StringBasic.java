package org.example.practice.ch05;

import java.util.Scanner;

public class StringBasic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("이름을 입력하세요: ");
        String name = scan.nextLine();
        System.out.println("name : " + name);
        System.out.print("성별을 입력하세요(여/남): ");
        String gender = scan.nextLine();

        if(gender.equals("여")) {
            System.out.println("여자입니다.");
        } else if(gender.equals("남")) {
            System.out.println("남자입니다.");
        }
        System.out.println(" -- 끝 -- ");
    }
}
