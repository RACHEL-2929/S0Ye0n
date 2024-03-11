package poly_pay0;

import java.util.Scanner;

public class PayMain0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PayService payService = new PayService();

        while(true) {
            System.out.print("결제 수단을 입력하세요:");
            String payOption = sc.nextLine();
            if(payOption.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }
            System.out.print("결제 금액을 입력하세요:");
            int amount = sc.nextInt();
            sc.nextLine();//엔터쳐서 넘어가는 걸 방지

            payService.processPay(payOption, amount);
        }

/*//kakao 결제
        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);
//naver 결제
        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2, amount2);
//잘못된 결제 수단 선택
        String payOption3 = "bad";
        int amount3 = 15000;
        payService.processPay(payOption3, amount3);*/
    }
}
