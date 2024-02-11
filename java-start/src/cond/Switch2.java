package cond;

public class Switch2 {

    public static void main(String[] args) {
        int grade = 1;

        int coupon;
        switch (grade) {
            case 1:            // grade = 1
                coupon = 1000;
                break;  // break가 없으면 그 다음 라인으로 넘어간다.
            case 2:            // grade = 2
                coupon = 2000;
                break;
            case 3:            // grade = 3
                coupon = 3000;
                break;
            default:           // grade가 1~3 중 어디에도 해당되지 않을 때
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰 : " + coupon );
    }
}
