package cond.ex;

public class MovieRateEx {

    public static void main(String[] args) {
//  요청한 평점 이상의 영화를 찾아서 추천하는 프로그램을 작성하자.
//  어바웃타임  - 평점 9점
//  토이 스토리 - 평점 8점
//  고질라     - 평점 7점
//  평점 변수는 double rating을 사용하세요. If문을 활용하세요.
        double rating = 7;

        if (rating <= 9) {
            System.out.println("'어바웃타임'을 추천합니다.");
        }
        if (rating <= 8) {
            System.out.println("'토이 스토리'을 추천합니다.");
        }
        if (rating <= 7) {
            System.out.println("'고질라'을 추천합니다.");
        }
    }
}
