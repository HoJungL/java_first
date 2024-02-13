package variable.ex;

/*
문제 :
1. long 타입의 변수를 선언하고, 그 변수를 백억으로 초기화한 후,
출력하는 프로그램을 작성하세요.
2. boolean 타입의 변수를 선언하고, 그 변수를 true로 초기환 한후,
출력하는 프로그램을 작성하세요.
 */
public class VarEx3 {
    public static void main(String[] args) {
        long l = 10000000000L ;
        boolean bool = true;
        System.out.println("long = " + l);
        System.out.println(bool);
    }
}
