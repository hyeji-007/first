package org.example.practice.java1.ch07_1.BankAccount00;

class BankAccount {

    int balance = 0;

    public int deposit(int amount) {
        balance += amount;
        return amount;
    }

    public int withdraw(int amount) {
        balance -= amount;
        return amount;
    }

    public int checkMyBalance() {
        System.out.println("잔액: " + balance);
        return balance;
    }
}

class BankAccount00 {
    public static void main(String[] args) {
        // 두 개의 인스턴스 생성
        BankAccount yoon = new BankAccount();
        BankAccount park = new BankAccount();

        // 각 인스턴스를 대상으로 예금을 진행
        yoon.deposit(5000);
        park.deposit(3000);

        // 각 인스턴스를 대상으로 출금을 진행
        yoon.withdraw(2000);
        park.withdraw(2000);

        // 각 인스턴스를 대상으로 잔액을 조회
        yoon.checkMyBalance();
        park.checkMyBalance();
    }
}
