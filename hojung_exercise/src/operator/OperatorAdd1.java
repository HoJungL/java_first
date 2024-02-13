package operator;

public class OperatorAdd1 {

    public static void main(String[] args) {
        int a = 0 ;

        a = a + 1 ;
        System.out.println("a = " + a);

        a = a + 1;
        System.out.println("a = " + a);

        // 전위(prefix) 증감:  연산자 증가시키고 쓰세요.
        ++a; // 1이 더해져서 나옵니다잉
        System.out.println("a = " + a);

        ++a; // if --a를 쓰면 1이 감소됨
        System.out.println("a = " + a);
    }
}
