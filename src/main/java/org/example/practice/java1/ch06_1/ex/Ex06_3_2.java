package org.example.practice.java1.ch06_1.ex;

public class Ex06_3_2 {

    public static void main(String[] args) {
        toBinary(10);
    }

    public static int toBinary(int decimal) {
        if(decimal > 0) {
            int bin = decimal % 2;
            decimal /= 2;

            toBinary(decimal);
            System.out.print(bin);
        }

        return 0;
    }
}
