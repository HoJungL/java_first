package loop.ex;

public class NestedEx1 { //Alt 엔터치면 rename 잇대
    public static void main(String[] args) {
        for(int i = 1; i<=9 ; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " +i*j);
            }
        }
    }
}
