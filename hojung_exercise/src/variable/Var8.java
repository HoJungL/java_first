package variable;

public class Var8 {
    public static void main(String[] args) {
        //정수 해당 범위 넘어가면 compile error 뜹니당
        byte b = 127; //-128~ 127 2의 8승
        short s = 32767; // -32768~ 32767 2의 16승
        int i = 2147483647; // -2147483648 ~ 2147483647 2의 32승

        //-9,223,372,036,854,775,808 ~9,223,372,036,854,775,807 2의 64승
        long l = 922337203685477580L;

        //실수
        float f = 10.0f; // 소수점 계산의 오류가 많이 발생함
        double d = 10.0; //정밀함. 일반적으로 실수에서는 double을 씀
    }
}
/*
자주 사용하는 변수 타입
정수 : int, long (파일을 다룰때는 byte)
실수 : double
불린형 : boolean , 조건문에서 자주 사용됨
문자형 : String
 */