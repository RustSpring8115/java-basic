package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        //영화 리뷰 정보 선언
        MovieReview mv1 = new MovieReview();
        mv1.title = "인셉션";
        mv1.review = "인생은 무한 루프";

        MovieReview mv2 = new MovieReview();
        mv2.title = "어바웃 타임";
        mv2.review = "인생 시간 영화";

        //영화 리뷰 정보 출력
        System.out.println("영화제목: " + mv1.title + " 리뷰내용: " + mv1.review);
        System.out.println("영화제목: " + mv2.title + " 리뷰내용: " + mv2.review);
    }

}
