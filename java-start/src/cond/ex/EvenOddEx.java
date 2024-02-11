package cond.ex;

public class EvenOddEx {

    public static void main(String[] args) {
//  정수 x가 주어지면 x가 짝수이면 "짝수"를, x가 "홀수"이면 "홀수"를 출력하는 프로그램을 작성하자.
//  삼항 연산자를 사용해야 한다.
//  참고로 x % 2 를 사용하면 홀수, 짝수를 쉽게 계산할 수 있다.
        int x = 3;

        String result = (x % 2 == 0) ? "짝수": "홀수";
        System.out.println("x = " + x + ", " + result);

        // =는 지정연산자 (e.g: x=1)
        // ==은 왼쪽과 오른쪽이 같다.
    }
}
