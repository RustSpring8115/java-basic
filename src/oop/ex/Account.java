package oop.ex;

public class Account {
    private int balance; //잔액

    //입금 메소드
    void desposit(int amount) {
        balance += amount;
    }

    //출금 메소드
    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액부족");
        }else {
            balance -= amount;
        }
    }
    //잔고 확인 메소드
    void isBalance() {
        System.out.println("잔고: " + balance);
    }
}
