package product;

import java.util.Scanner;

public class ProductOrderMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//스캐너를 이용하여 사용자 입력 받기
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int total = sc.nextInt();//정수로 입력 받은 값을 total에 저장하기
        sc.nextLine();//위에서 입력(엔터)로 인해 생긴 \n을 위해 넣음
        ProductOrder[] orders = new ProductOrder[total];//total만큼 여러 상품 주문 정보를 담는 배열 생성

        for (int i = 0; i < total; i++) {//반복문 사용
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String productName = sc.nextLine();//사용자에게 받은 문자열을 productName에 저장
            System.out.print("가격: ");
            int price = sc.nextInt();//사용자에게 받은 정수를 price에 저장
            System.out.print("수량: ");
            int quantity = sc.nextInt();//사용자에게 받은 정수를 quantity에 저장
            orders[i] = createOrder(productName,price,quantity);
            //creatOrder()을 사용해서 상품 주문 정보들을 생성하고 배열에 저장한다
        }

        printOrders(orders);//printOrders()를 사용해서 상품 주문 정보 출력
        int sum = getTotalAmount(orders);//getTotalAmount()을 사용해서 총 결제 금액 계산
        System.out.println("총 결제 금액: " + sum);
    }
    static ProductOrder createOrder(String productName, int price, int quantity)
    {
        ProductOrder productOrder = new ProductOrder();//ProductOrder 생성
        productOrder.productName = productName;//매개변수로 초기값 설정
        productOrder.price = price;//매개변수로 초기값 설정
        productOrder.quantity = quantity;//매개변수로 초기값 설정
        return productOrder;//반환하기
    }
    static void printOrders(ProductOrder[] orders){
        for (ProductOrder po: orders) {
            System.out.println("상품명: " + po.productName + ", 가격: " + po.price + ", 수량: " + po.quantity);
        }
        //배열을 받아서 배열에 들어있는 전체 ProductOrder의 상품명, 가격, 수량 출력
    }
    static  int getTotalAmount(ProductOrder[] orders){
        int sum = 0;
        for (ProductOrder po: orders) {
            sum += po.price * po.quantity;
        }
        return sum;
        //배열을 받아서 배열에 들어있는 전체 ProductOrder의 총 결제 금액을 계산하고, 계산결과 반환
    }
}
