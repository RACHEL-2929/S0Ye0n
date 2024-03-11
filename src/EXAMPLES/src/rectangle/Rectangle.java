package rectangle;

public class Rectangle {
    int width;
    int height;

    int calculateArea(int width, int height) {
        return width * height;
    }//넓이 구하기

    int calculatePerimeter(int width, int height) {
        return 2 * (width + height);
    }//둘레 길이 구하기

    boolean isSquare(int width, int height) {
        return width == height;
    }//정사각형 여부 구하기
}
