package cond;

public class Switch3 {

    public static void main(String[] args) {
        int grade = 2;

        int coupon;
        switch (grade){ // 특정 값이 들어가는거임.
            case 1:
                coupon = 1000;
                break;
            case 2: // break 없으면 case3 구문이 실행 됨
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰: "+ coupon);
    }
}
