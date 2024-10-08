package org.example.day03.ch05;

public class Mission1_2 {

    public static void main(String[] args) {
          /*
        switch문을 이용하여
        3, 4, 5 > "봄"
        6, 7, 8 > "여름"
        9, 10, 11 > "가을"
        12, 1, 2 > "겨울
         */

        int mon = 9;

        switch(mon) {
            case 3:
            case 4:
            case 5:
                System.out.println("봄");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("가을");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("겨울");
                break;
            default:
                System.out.println("잘못입력하였습니다.");
        }
        System.out.println("----------------");

        switch(mon) {
            case 3: case 4: case 5:
                System.out.println("봄");
                break;
            case 6: case 7: case 8:
                System.out.println("여름");
                break;
            case 9: case 10: case 11:
                System.out.println("가을");
                break;
            case 12: case 1: case 2:
                System.out.println("겨울");
                break;
            default:
                System.out.println("잘 못입력하였습니다.");
        }
        System.out.println("----------------");

        switch(mon) {
            case 3, 4, 5:
                System.out.println("봄");
                break;
            case 6, 7, 8:
                System.out.println("여름");
                break;
            case 9, 10, 11:
                System.out.println("가을");
                break;
            case 12, 1, 2:
                System.out.println("겨울");
                break;
            default:
                System.out.println("잘 못입력하였습니다.");
        }
        System.out.println("----------------");
    }
}
