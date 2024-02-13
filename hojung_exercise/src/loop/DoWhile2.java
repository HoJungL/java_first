package loop;

public class DoWhile2 {

    public static void main(String[] args) {
        int i = 10;

        do {
            System.out.println("현재 숫자는:" + i);
            i++;
        } while (i<3); // 최초 한번은 실행됨. 그리고 나서 조건을 확인함.
    }
}
