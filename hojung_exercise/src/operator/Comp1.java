package operator;

public class Comp1 {

    public static void main(String[] args) {
        // 비교 연산자
        int a = 2, b= 3;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        //결과를 boolean 변수에 담을 수 잇음
        boolean result = a==b;
        System.out.println(result);
    }
}
