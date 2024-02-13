package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        int sum = 0;
        double average = 0;

        System.out.println("5개의 정수를 입력하세요");
        for (int i = 0; i < arr.length; i++) { //arr.length 대신 5를 써도 됨
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        average = (double) sum / 5;

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);

    }
}
