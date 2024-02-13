/*
더 큰 숫자 찾기.
두개의 정수 변수 a,b를 가지고 있다. a= 10, b=20일때
삼항 연산자를 사용하여 두 숫자 중 더 큰 숫자를 출력하는 코드를 작성하라
 */
package cond.ex;

public class Condex6 {

    public static void main(String[] args) {
        int a = 10, b = 20;
        int large = (a > b) ? a : b;
        System.out.println("더 큰 숫자는 " + large + "입니다");
    }
}
