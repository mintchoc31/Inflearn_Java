package operator.ex;

public class OperationEx3 {

    public static void main(String[] args) {
//  int형 변수 score를 선언하세요.
//  score가 80점 이상이고, 100점 이하이면 true를 출력하고, 아니면 false를 출력하세요.

        int score = 80; // score의 값에 따라 boolean의 결과값이 달라진다.
        boolean result = score >= 80 && score <= 100;
                       //80 <= score && score <= 100; 로 쓰면 읽기 편해진다.
        System.out.println("result = " + result);


    }
}
