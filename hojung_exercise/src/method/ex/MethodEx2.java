//아래의 코드를 메서드를 사용하여 리펙토링 해보자.
/*
package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        String message = "Hello, world!";

        for (int i = 0; i < 3; i++) {
            System.out.println(message);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
        }
        for (int i = 0; i < 7; i++) {
            System.out.println(message);
        }

    }
}*/

package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        String str = "Hello World!";
        hello("Hello", 5);
        hello("world", 7);
        hello("java", 3);
    }

    public static void hello(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }
}