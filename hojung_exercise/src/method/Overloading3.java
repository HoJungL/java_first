package method;

import com.sun.security.jgss.GSSUtil;

public class Overloading3 {
    public static void main(String[] args) {
        System.out.println("1: " + add(1, 2));
        System.out.println("2: " + add(1.2, 1.5));
    }
    // 이거 지우고 돌려도 작동함.
    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    // 얘는 지우면 에러 뜹니당?
    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}
