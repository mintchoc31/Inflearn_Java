package cond;

public class CondOp2 {

    public static void main(String[] args) {
        int age = 18;
                                    //  참   :   거짓
        String status = (age >= 18) ? "성인" : "미성년자"; // 조건이 참이므로 참 표현식 부분이 선택된다.
        System.out.println("age = " + age + " status = " + status);
        // 단순히 참과 거짓에 따라서 특정값을 구할 때 삼항 연산자를 사용하면 if문 보다 간결하게 코드를 짤 수 있다.
    }
}
