/*
intValue = (int) doubleValue에서
(int) 처럼 직접 괄호를 사용해서 명시적으로 입력하는데
이걸 형(타입)을 바꾼하다고 해서 형변환이라고 하며, 캐스팅이라고함.
개발자가 직접 코드를 입력한다고 해서 명시적 형변환이라고 함.

매우 중요
명시적 형변환을 한다고 해서 doubleValue의 값이 바뀌는건 아님.
즉, doubleValue 값은 1.5로 고정이 되어있음.
 */
package casting;

public class Casting2 {

    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue ;

        // intValue = doubleValue; // 컴파일 오류 발생
        // java : incompatible types: possible lossy conversion from double to int
        // java : 호환되지 않는 유형 : double 에서 int로의 가능한 손실 변환
        intValue = (int) doubleValue; // 형변환
        System.out.println("intValue : " + intValue);
        System.out.println("doubleValue : " + doubleValue);

        System.out.println(10.5);
        System.out.println( (int) 10.5);
    }
}
