package org.example.practice.ch07.PassingRef;

class BankAccount {
    int balance = 0;

    public int deposit(int amount) {
        balance += amount;
        return balance;
    }

    public int withdraw(int amount) {
        balance -= amount;
        return balance;
    }

    public int checkMyBalance() {
        System.out.println("잔액: " + balance);
        return balance;
    }
}


public class PassingRef {

    public static void main(String[] args) {
        BankAccount ref = new BankAccount(); //인스턴스(객체) 생성
        ref.deposit(3000);
        ref.withdraw(300);
        check(ref); // '참조 값'의 전달
    }

    public static void check(BankAccount acc) {
        acc.checkMyBalance(); // acc가 참조하는 인스턴스의 메소드 호출
    }
}
