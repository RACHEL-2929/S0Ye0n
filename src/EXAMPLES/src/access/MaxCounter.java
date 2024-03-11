package access;

public class MaxCounter {
    //최대값을 지정, 최대값까지만 값이 증가하는 기능 제공
    //데이터는 private으로 숨기기
    private int count;//내부에서 사용하는 숫자 초기값 0
    private int max;//최대값, 생성자를 통해 입력

    //기능은 public으로 오픈해놓기
    public MaxCounter(int max) {
        this.max = max;
    }
    public void increment() {
        if(count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
        }
        else {
            count++;
        }
    }//숫자를 하나 증가한다.
    int getCount() {
        return count;
    }//지금까지 증가한 값을 반환한다.


    //캡슐화 연습
}
