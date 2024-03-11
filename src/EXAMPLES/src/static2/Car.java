package static2;

public class Car {
    private String carName;
    private static int count;

    public Car(String carName) {
        System.out.println("차량 구입, 이름: " + carName);
        this.carName = carName;
        count++;
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수: " + count);
    }
    //static 메소드와 변수는 메소드 영역에 계속 있어서 공유하는 변수나 메소드를 활용할 때 사용하면 좋다.
    //static 메소드, 정적 메소드, 클래스 메소드 (변수도 같음)이라고 부른다.
    //인스턴스는 힙 영역에서 만들어지므로 static으로 접근하지 않으면 count가 각각 자기 인스턴스에서만 작용함
    //static을 사용함으로써 총 count를 알 수 있음
}
