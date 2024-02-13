/*
매우 중요!!!!!! 대원칙
자바는 항상 변수의 값을 복사해서 대입한다.
자바는 항상 변수의 값을 복사해서 대입한다.
자바는 항상 변수의 값을 복사해서 대입한다.
자바는 항상 변수의 값을 복사해서 대입한다. = 변수 자체가 들어가는게 아니다!!!
 */
package method;

public class MethodValue0 {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = num1;
        num2 = 10;
        System.out.println("num1=" + num1);
        System.out.println("num2=" + num2);
    }
}
