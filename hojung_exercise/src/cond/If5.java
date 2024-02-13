/*
age가 10임에도 불구하고 할인이 안돼
 */
package cond;

public class If5 {

    public static void main(String[] args) {
        int price = 10000, age = 10, discount = 0;

        if (price >= 10000) {
            discount += 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        } else if (age <= 10) {
            discount += 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인없음");
        }

        System.out.println("총 할인 금액: " + discount + "원");

    }
}