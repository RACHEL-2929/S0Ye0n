package movie;

import java.util.Scanner;

public class MovieReviewMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 개의 리뷰를 등록하시겠습니까?-> ");
        int cnt = sc.nextInt();
        sc.nextLine();
        MovieReview[] reviews = new MovieReview[cnt];//2개의 배열로 생성

        for (int i = 0; i < cnt; i++) {
            MovieReview movieReviews = new MovieReview();//movieReviews 참조값 가지고 있음
            System.out.print("영화 제목을 입력해주세요: ");
            movieReviews.title = sc.nextLine();//영화제목 넣기
            System.out.print("영화 리뷰를 입력해주세요: ");
            movieReviews.review = sc.nextLine();//리뷰 넣기
            reviews[i] = movieReviews;
        }
//반복문으로 출력하기
        for (MovieReview mR: reviews) {
            System.out.println("영화 제목: " + mR.title + ", 리뷰:" + mR.review);
        }
        //반복문을 사용해서 저장된 값들 출력하기 reviews에 저장된 개수만큼
    }
}
//아래의 코드를 리팩토링 해봄(수정사항: 영화 제목과 리뷰를 사용자 입력으로 바꿔봄)
/*MovieReview[] reviews = new MovieReview[2];//2개의 배열로 생성

        MovieReview movieReview1 = new MovieReview();//movieReview1생성
        movieReview1.title = "오만과편견";//영화제목 넣기
        movieReview1.review = "주기적으로 봐줘야 하는 영화";//리뷰 넣기
        reviews[0] = movieReview1;//movieReview1의 참조값을 review[0]에 넣기

        MovieReview movieReview2 = new MovieReview();//movieReview1생성
        movieReview2.title = "웡카";//영화제목 넣기
        movieReview2.review = "움파룸파";//리뷰 넣기
        reviews[1] = movieReview2;//movieReview1의 참조값을 review[0]에 넣기

//반복문으로 출력하기
        for (MovieReview mR: reviews) {
            System.out.println("영화 제목: " + mR.title + ", 리뷰:" + mR.review);

        }
        //반복문을 사용해서 저장된 값들 출력하기 reviews에 저장된 개수만큼*/
