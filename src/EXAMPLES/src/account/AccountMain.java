package account;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);//10000원 입금
        account.showBalance();
        account.withdraw(9000);//9000원 출금
        account.showBalance();
        account.withdraw(2000);//2000원 출금 시도
        account.showBalance();
    }
}
