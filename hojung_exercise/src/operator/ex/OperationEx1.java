package operator.ex;

/*
다음과 같은 작업을 수행하는 프로그램을 작성하셰요.
클래스 이름은 operationEx1라고 적어주세요.

1. num1, num2, num3 라는 이름의 세개의 int변수를 선언하고,
10, 20 ,30 으로 초기화하세요.
2. 세변수의 합을 계산하고, 그 결과를 sum 이라는 int 변수에 저장하세요.
3. 세변수의 평균을 계산하고, 그 결과를 average라는 이름의 int 변수에 저장하세요.
(단, 평균 계산시 소수점 이하의 결과는 버림하세요.)
4. sum과 average 변수의 값을 출력하세요.
 */
public class OperationEx1 {

    public static void main(String[] args) {
        int num1= 10, num2 = 20, num3 = 30;
        int sum = num1 + num2 + num3;
        int average = sum / 3;
        System.out.println("sum = "+ sum);
        System.out.println("average = "+ average);
    }
}
