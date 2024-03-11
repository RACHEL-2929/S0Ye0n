package movie;

public class starReview {
    public starReview(int star, MovieReview movieReviews) {
        if(star==5) {
            movieReviews.review = "★★★★★";//리뷰 넣기
        } else if (star==4) {
            movieReviews.review = "★★★★☆";//리뷰 넣기
        } else if (star==3) {
            movieReviews.review = "★★★☆☆";//리뷰 넣기
        } else if (star==2) {
            movieReviews.review = "★★☆☆☆";//리뷰 넣기
        } else if (star==1) {
            movieReviews.review = "★☆☆☆☆";//리뷰 넣기
        } else if (star==0) {
            movieReviews.review = "☆☆☆☆☆";//리뷰 넣기
        } else {
            System.out.println("입력 실패!! 0부터 5사이의 숫자만 넣어주세요");
        }
    }
}
