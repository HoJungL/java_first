package scanner;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {
        // Scanner scanner : 스캐너라는 변수를 선언하는것.
        // type을 다르게 입력하면 그냥 날라가는거야.
        Scanner scanner = new Scanner(System.in);

        System.out.print("hello\n");
        System.out.println("hello");

        System.out.print("문자열을 입력하세요:");
        String str = scanner.nextLine();
        System.out.println("입력한 문자열: " + str);

        System.out.print("정수를 입력하세요:");
        int intValue = scanner.nextInt();
        System.out.println("입력한 정수: " + intValue);

        System.out.print("실수를 입력하세요:");
        double doubleValue = scanner.nextDouble();
        System.out.println("입력한 실수: " + doubleValue);
    }
}
