/*
메서드 정의
public static
제어자 : public, static 과 같은 부분
반환타입 : method가 실행 된 후, 반환하는 데이터 타입 지정. 값 반환 안하면 void 쓰면 됨
메서드 이름: 메서드 이름. 메서드 호출에 사용
매개변수 : 메서드 내부에 사용하는 변수로, 옵션임. 입력값 필요 없다면 매개변수 지정 안해도 됨
메서드 본문 : 메서드 코드가 있으며, {}사이에 코드 작성

중요!!! : 반드시 return을 써야함. 단, void라면 return을 안써도 됨.
 */

package method;

public class method2 {
    public static void main(String[] args) {
        printHeader();
    }

    public static void printHeader() {
        System.out.println("= 프로그램을 시작합니다. =");
        return;
    }

    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다. =");
        return;
    }
}
