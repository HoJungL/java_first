package method;

public class MethodCasting1 {

    public static void main(String[] args) {
        double number = 1.5;
        //printNumber(number); -> 큰형(double)을 작은형(int)으로 안됨
        printNumber((int) number); // 명시적 형변환 하면 됨
    }

    public static void printNumber(int n) {
        System.out.println("숫자: " + n);
    }
}
