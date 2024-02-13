/*
자동 형변환 과정 - 작은거를 큰거에 넣을때!
intvalue = 10
doublevalue = intvalue
doublevalue = (double) intvalue // 형 맞추기
doublevalue = (double) 10 // 변수 값 읽기
doublevalue = 10.0 // 형 변환
 */
package casting;

public class Casting1 {

    public static void main(String[] args) {
        int intValue =10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int -> long
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; // int -> double
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20000000L; // long -> double
        System.out.println("doubleValue2 = " + doubleValue);
    }
}
