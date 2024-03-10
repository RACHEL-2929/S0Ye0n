package movie;

import java.util.Scanner;

public  class ReviewProcess {
    public ReviewProcess(int cnt, MovieReview[] reviews) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < cnt ; i++) {
            MovieReview movieReviews = new MovieReview();//movieReviews 참조값 가지고 있음
            System.out.print("어떤 영화를 보셨나요?: ");
            movieReviews.title = sc.nextLine();//영화제목 넣기
            System.out.print("영화 평가를 해주세요(5점 만점 기준):");
            int star = sc.nextInt();
            sc.nextLine();
            new starReview(star,movieReviews);
            reviews[i] = movieReviews;
        }
    }
}