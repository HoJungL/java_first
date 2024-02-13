/*
여기서 temp는  if문에만 쓰기 때문에 main 변수로 선언하는건 별로 좋지 않아.
scope 가 길어짐에 따라,
1. 비효율적인 메모리 사용
2. 코드 복잡성 증가

 */
package scope;

public class Scope3_1 {

    public static void main(String[] args) {
        int m = 10, temp = 0;
        if (m>0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m= " + m);
    }
}
