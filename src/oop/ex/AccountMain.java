package oop.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        account.desposit(10000);
        //계좌에서 9000원을 출금해라.
        account.withdraw(9000);
        //계좌에서 2000원을 출금 시도해라.
        account.withdraw(2000);
        //잔고를 출력해라.
        account.isBalance();
    }
}
