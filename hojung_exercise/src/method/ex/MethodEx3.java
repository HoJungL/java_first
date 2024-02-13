// 아래의 코드를 method 를 사용하여 리팩토링 해보세요
/*
package method.ex;

public class MethodEx3 {
    public static void main(String[] args) {
        int balance = 10000;
        
        // 입금 500
        int depositAmount = 1000;
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        
        // 출금 200
        int withdrawAmount = 2000;
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액:" + balance + "원");
        } else {
            System.out.println(withdrawAmount + "원 출금하려 했으나 잔액 부족");
        }

        System.out.println("최종 잔액: "+balance+"원");
    }
}
*/

package method.ex;

public class MethodEx3 {
    public static void main(String[] args) {
        int balance = 10000;
        balance = deposit(10000, 50000);
        balance = withdraw(balance, 20000);
        System.out.println("최종잔액: "+ balance+"원");
    }

    public static int deposit(int a, int b) {
        a += b;
        System.out.println(b+"원을 입금하였습니다. 현재 잔액: " + a +"원");
        return a;
    }

    public static int withdraw(int a, int b) {
        if (a >= b) {
            a -= b;
            System.out.println(b + "원을 출금하였습니다. 현재 잔약: " + a + "원");
        } else {
            System.out.println(b + "원을 출금하려 했으나 잔액 부족");
        }
        return a;
    }
}