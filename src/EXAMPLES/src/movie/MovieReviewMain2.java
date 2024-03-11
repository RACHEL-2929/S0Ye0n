package movie;

import java.util.Scanner;
//MovieReviewMain을 리팩토링(main의 길이를 줄여보고 처리과정을 클래스로 나눠봄)
public class MovieReviewMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 개의 리뷰를 등록하시겠습니까?: ");
        int cnt = sc.nextInt();
        sc.nextLine();
        MovieReview[] reviews = new MovieReview[cnt];
        new ReviewProcess(cnt, reviews);//리뷰를 등록하는 과정
        new PrintReviews(reviews);//등록된 리뷰를 출력하는 과정
    }
}