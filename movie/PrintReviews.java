package movie;

public class PrintReviews {
    PrintReviews(MovieReview[] reviews){
        for (MovieReview mR: reviews) {
            System.out.println("영화 제목: " + mR.title + ", 리뷰:" + mR.review);
        }
    }
}
