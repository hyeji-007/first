package org.example.day03.ch05;

public class SwitchBasic {

    public static void main(String[] args) {
        int n = 4;

        switch(n) {
            case 1:
                System.out.println("Simple Java");
                break;
            case 2:
                System.out.println("Funny Java");
                break;
            case 3:
                System.out.println("Fantastic Java");
                break;
            default :
                System.out.println("The best programming language");
                break;
        }

        System.out.println("Do you like Java?");
        System.out.println("------------------");

        if(n == 1) {
            System.out.println("Simple Java");
        } else if(n == 2) {
            System.out.println("Funny Java");
        } else if (n == 3) {
            System.out.println("Fantastic Java");
        } else {
            System.out.println("The best programming language");
        }

        System.out.println("Do you like Java?");
    }
}
