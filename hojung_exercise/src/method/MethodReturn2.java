/*
return을 만나면 그냥 method를 나가버림.
 */
package method;

public class MethodReturn2 {

    public static void main(String[] args) {
        checkAge(20);
    }

    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println(age + "살, 미성년자는 출입이 불가능 합니다.");
            return;
        }

        System.out.println(age + "살, 입장하세요");

    }
}
