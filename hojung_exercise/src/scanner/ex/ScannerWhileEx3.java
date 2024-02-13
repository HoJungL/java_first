package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0, count = 0;
        double average=0;

        while (true) {

            System.out.println("숫자를 입력하세요. 입력을 중단할면 -1을 입력하세요");
            int n = scanner.nextInt();

            if (n == -1) {
                break;
            }
            sum += n;
            count++;
            average = (double) sum/count;
        }
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + average);
    }
}

/*
while문 축약해봐요
while (( int n = scanner.nextInt()) != -1) {
    sum += n;
    count++;
}
이렇게도 써용
 */