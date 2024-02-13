/*
정수 x가 주어지면 x가 짝수면 "짝수" 홀수면 "홀수:를 출력하는 프로그램 작성
삼항 연산자를 사용할것.
 */
package cond.ex;

public class Condex7 {

    public static void main(String[] args) {
        int x = 3;
        String result = (x % 2 != 0) ? "홀수" : "짝수";
        System.out.println("x = " + x + ", " + result);
    }
}
