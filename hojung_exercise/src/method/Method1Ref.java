package method;

public class Method1Ref {

    public static void main(String[] args) {
        // 계산 1
        int sum1 = add(5, 10);
        System.out.println("결과1 출력:" + sum1);

        // 계산 2
        int sum2 = add(10, 20);
        System.out.println("결과2 출력:" + sum2);

        //반환값 필요없고, 호출만 할래 (void는 아니죠잉)
        add(100, 200);
    }

    //add method
    /*
    int add (int a, int b)
    int : 반환 타입을 정의한다. method의 실행결과를 반환할때 사용할 반환 타입을 지정함
    add : method의 이름 부여
    (int a, int b)
    method를 호출할 때 전달하는 입력 값을 정의함.
    이 변수들은 해당 method 안에서만 사용됨
    이 변수를 영어로 parameter, 한글로 매개변수라고함.
     */
    public static int add(int a, int b) { // ctrl + b 누르면 쓰이는 행 나옴
        System.out.println(a + "+" + b + "연산 수행");
        int sum = a + b;
        return sum;
    }
}
/*
추가 설명
method describe 및 용어 정리
parameter의 타입및 개수가 맞아야함.
호출 : call("hello", 20)
method define: int call(String str, int age)

인수(Argument)
"hello", 20을 인수, 아규먼트라고 함
method를 호출할때 인수를 넘기면 인수가 매개변수에 대입됨
실무에서는 매개변수, 파라미터 다씀

즉, 인수는 method 내부에 들어가는 값
파라미터는 method 호출부와 method 내부 사이의 값을 전달하는 역할을 하는 변수

 */
