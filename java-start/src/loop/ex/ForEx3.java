package loop.ex;

public class ForEx3 {

    public static void main(String[] args) {
//  반복문을 사용하여 1부터 max까지의 합을 계산하고 출력하는 프로그램을 작성해보세요.
//  이때, sum이라는 변수를 사용하여 누적합을 표현하고,
//  i라는 변수를 사용하여 카운트(1부터 max까지 증가하는 변수)를 수행해야 합니다.
        int max = 100;

        int sum = 0;
        for(int i = 1; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
