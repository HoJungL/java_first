package method;

public class MethodReturn1 {

    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result );
    }

    public static boolean odd(int i) { // else가 없으면 에러 뜸. (모든 경우를 포함하지 않기 때문에)
        if (i % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
