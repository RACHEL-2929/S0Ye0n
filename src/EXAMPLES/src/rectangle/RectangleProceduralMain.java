package rectangle;

public class RectangleProceduralMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        int w = 5;
        int h = 8;
        int area = rectangle.calculateArea(w,h);
        System.out.println("넓이: " + area);

        int perimeter = rectangle.calculatePerimeter(w,h);
        System.out.println("둘레 길이: " + perimeter);

        boolean square = rectangle.isSquare(w,h);
        System.out.println("정사각형 여부: " + square);
    }
}
