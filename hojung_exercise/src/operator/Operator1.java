package operator;

public class Operator1 {

    public static void main(String[] args) {
        // 변수 초기화
        int a = 5 , b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum);

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        // 나눗셈
        int div = a / b ; // .5를 표현을 못함. if b가 0일경우 나머지가 안나옴. 실행이 안됨
        System.out.println("a / b = " + div);

        // 나머지
        int mod = a % b ;
        System.out.println("a % b = "+ mod);

    }
}
