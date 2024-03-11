package account;

//
public class Account {
    private int balance;//잔액(데이터는 private로 숨기기)

    void deposit(int amount) {
        balance += amount;//잔액 증가
        System.out.printf(amount + "원 입금되었습니다.");
    }//입금하는 메서드

    void withdraw(int amount) {
        if(isAmountValid(amount)&&(balance >= amount)) {//잔액이 부족하면
            balance -= amount;// 잔액 출력
            System.out.printf(amount + "원 출금되었습니다.");
        } else {
            System.out.println("출금에 실패했습니다. 유효하지 않은 금액 or 잔액 부족입니다.");
        }
    }//출금하는 메서드

     private boolean isAmountValid(int amount) {
        return amount > 0;//amount가 0보다 큰 숫자인지 검증
    }

    void showBalance() {
        System.out.println("잔액: " + balance);
    }
}
