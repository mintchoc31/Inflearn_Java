package operator;

public class Operator1 {

    public static void main(String[] args) {
        // 변수 초기화
         int a = 5;
         int b = 2;

         // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum); // 출력 a + b = 7

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff); // 출력 a - b = 3

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi); // 출력 a * b = 10

        // 나눗셈
        int div = a / b;
        System.out.println("a / b = " + div); // 출력 a / b = 2
        // int형 끼리 계산을 했으므로 값도 int형이 나옴(소수점 표현x)

        // 나머지
        int mod = a % b; // 5/2 = 2, 나머지 1
        System.out.println("a % b = " + mod); // 출력 a % b = 1

        // int z = 10 / 0;
        // 숫자는 0으로 나눌 수 없다. 수학에서 허용하지 않음
        // 예외 발생 : ArithmeticException: / by zero
        // 예외가 발생하면 해당 시점 이후의 결과가 출력되지 않고 프로그램이 종료됨
    }
}
