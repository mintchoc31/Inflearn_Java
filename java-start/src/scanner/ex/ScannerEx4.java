package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {

    public static void main(String[] args) {
//  사용자로부터 하나의 정수 n을 입력받고, 입력받은 정수 n의 구구단을 출력하는 프로그램을 작성하세요.
        Scanner input = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력해주세요: ");
        int n = input.nextInt();
        int i = 0;

        System.out.println(n + "단의 구구단:");
        while(i < 9) {
            i ++;
            System.out.println(n + " x " + i + " = " + ( n * i));

        /* 다른 풀이 방법 (for문 사용)
            for(int i = 1; i <= 9; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            }
         */
        }
    }
}
