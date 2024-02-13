/*
매우 중요!!!!!! 대원칙
자바는 항상 변수의 값을 복사해서 대입한다.
자바는 항상 변수의 값을 복사해서 대입한다.
자바는 항상 변수의 값을 복사해서 대입한다.
자바는 항상 변수의 값을 복사해서 대입한다. = 변수 자체가 들어가는게 아니다!!!
 */
package method;

public class MethodValue2 {

    public static void main(String[] args) { // main도 method 임.
        int number =5;
        System.out.println("1. changeNumber 호출 전, number: " + number);
        changeNumber(number);

        // 이부분이 아주 중요함.
        System.out.println("4. changeNumber 호출 후, number: " + number);
    }

    // 위 아래 public static에 있는 number은 분리된 다른 변수임. 다른 메모리에 생기는
    // 지역변수.(method 안에서 선언되는거 = 지역변수)
    public static void changeNumber(int number) {
        System.out.println("2. changeNumber 변경 전, number: " + number);
        number = number*2;
        System.out.println("3. changeNumber 변경 후, number: " + number);
    }
}
