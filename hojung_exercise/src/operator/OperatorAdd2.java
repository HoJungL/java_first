package operator;

public class OperatorAdd2 {

    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        b = ++a; // a의 값을 먼저 증가시키고, 그 결과를 b에 대입
        System.out.println("a = "+ a + ", b = " + b);


        // 후위 증감 연산자 사용 예
        a = 1;
        b = 0;

        b= a++; // b에 a 값을 먼저 대입하고, 후에 a값을 증가시킴
        System.out.println("a = "+ a + ", b = " + b);

        ++a; // 자기자신에게만 쓰는경우에는 전위 후위 상관없음
        System.out.println(a);
        a++;
        System.out.println(a);
    }
}
