package method;

public class MethodCasting2 {

    public static void main(String[] args) {
        int number = 100;
        printNumber(number); // 작은거 -> 큰거는 가능해여. 이게 자동 형변환
    }

    public static void printNumber(double n) {
        System.out.println("숫자: " + n);
    }
}

/*
과정
void printNumber(double n=100)
void printNumber(double n= (double) 100)
void printNumber(double n=100.0)
 */
