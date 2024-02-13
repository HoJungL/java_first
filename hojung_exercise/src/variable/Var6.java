package variable;

public class Var6 {

    public static void main(String[] args) {
        int a;
        // System.out.println(a); // compile 하려면 이줄을 주석 처리 하기. 하면, compile은 되지만 아무것도 출력이 안됨.
    }
}
/*
java: variable a might not have been initialized
변수가 초기화 되지 않았다는 오류
변수를 선언하면 메모리상의 공간을 차지하고 사용함.
but, 그 공간의 기존에 어떤 값이 있었는지는 모름.
따라서, 변수 초기화를 하지 않으면, 이상한 값을 출력할 가능성이 있음
따라서, java는 변수를 초기화 하도록 강제함.
 */

/*
지역 변수는 개발자가 직접 초기화를 해주어야 한다.
(Local Variable)

compile error : 자바 문법에 맞지 않을때 뜨는 에러임.
좋은 에러랍니다. 빨리 찾을 수 있어서 ㅎㅎ...

 */