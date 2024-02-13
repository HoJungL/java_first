package array.ex;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int count = scanner.nextInt();
        int[] arr = new int[count];

        int min=9999, max=-9999; // min, max 만들고 min = max = arr[0]해도 됨
        System.out.println(count + "개의 정수를 입력하세요:");
        for (int i = 0; i < count; i++) {
            arr[i] = scanner.nextInt();
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("가장 작은 정수:" + min);
        System.out.println("가장 큰 정수:" + max);
        
    }
}
