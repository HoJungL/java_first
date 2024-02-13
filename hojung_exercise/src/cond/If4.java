/*
모든 if 문을 적용 시켜야할 경우!!
else if를 쓰면 틀려짐.
 */
package cond;

public class If4 {
    public static void main(String[] args) {
        int price = 10000 , age = 10, discount = 0;

        if (price >= 10000) {
            discount += 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }

        if (age <= 10) {
            discount += 1000;
            System.out.println("어린이 1000원 할인");
        }

        System.out.println("총 할인 금액: " + discount + "원");
    }
}
