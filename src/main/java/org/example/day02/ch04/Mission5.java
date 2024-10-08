package org.example.day02.ch04;

public class Mission5 {

    public static void main(String[] args) {
        /*
        n1 = ((25 + 5) + (36 / 4) - 72) * 5
        n2 = ((25 * 5) + (36 - 4) + 71) / 4
        n3 = (128 / 4) * 2
        */

        int n1 = ((25 + 5) + (36 / 4) - 72) * 5;
        int n2 = ((25 * 5) + (36 - 4) + 71) / 4;
        int n3 = (128 / 4) * 2;

        System.out.println("n1: " + n1);
        System.out.println("n2: " + n2);
        System.out.println("n3: " + n3);

        System.out.println((n3 < n2) && (n2 < n1));
    }
}
