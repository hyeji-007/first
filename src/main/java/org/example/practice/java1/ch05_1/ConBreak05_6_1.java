package org.example.practice.java1.ch05_1;

public class ConBreak05_6_1 {

    public static void main(String[] args) {
        int count = 0;

        for(int num = 1; num <= 100; num++) {
            if((num % 5) != 0 || (num % 7) != 0)
                continue;
            count++;
            System.out.println(num);
        }
        System.out.println("count: " + count);
    }
}
