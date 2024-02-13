package cond;

public class If1 {
    public static void main(String[] args) {
        int age = 20;

        if (age >= 18) {
            System.out.println("성인입니다.");
        }

        if (age < 18) {
            System.out.println("미성년자입니다.");
        } // 코드 실행은 됨. 하지만 false 이기때문에 출력이 안됨.
    }
}
