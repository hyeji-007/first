package org.example.practice.java1.ch05;

public class Break07_7_2 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ( (i * 10 + j) + (j * 10 + i) == 99) {
                    System.out.println(i + ", " + j);
                }
            }
        }
    }
}
