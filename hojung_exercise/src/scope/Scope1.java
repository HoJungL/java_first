//scope : 범위!
//m은 scope가 넓고, x는 scope가 짧고
package scope;

public class Scope1 {

    public static void main(String[] args) {
        int m = 10; // m 생존 시작
        if (true) {
            int x = 20 ; // x 생존 시작
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } // x 죽음 아래에 sout(x)하면 에러뜸
        System.out.println("main m = " + m);
    } // m도 죽음
}
