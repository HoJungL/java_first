/*
Scope3_1을 간단하게 해보자!
ctrl + N 누르면 바로 class 찾을 수 있음.
ctrl + E 누르면 이전의 작업 class로 감.
 */
package scope;

public class Scope3_2 {

    public static void main(String[] args) {
        int m = 10;
        if (m>0) {
            int temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m= " + m);
    }
}
