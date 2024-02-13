/*
메소드 장점
1. 코드 재사용 : 특정 기능을 캡슐화 하므로, 호출함으로써 코드 재사용 가능
2. 가독성 : 수행하는 작업을 명확하게 함. 리뷰어에게 정보 제공
3. 모듈성 : 큰 프로그램을 작은, 관리 가능한 부분으로 나눌수 잇음. 가독성 향상 및 디버깅 쉽게.
4. 코드유지 관리 : 특정 오류가 생겼을 경우, 그 부분만 디버깅하면됨
5. 재사용성 및 확장성 : 새로운 기능 추가하거나, 기존 기능 확장에 유용
6. 추상화 : 메서드 사용하는 곳에서는 구현 몰라도 됨. 복잡한 내부 작업 이해 안해도 됨.
7. 테스트 및 디버깅 용이성 : 개별 메소드는 독립적으로 테스트하고 디버깅 가능. 이는 빠르게 찾고 수정하는데 도움

즉, 메소드는 효율적으로 유지보수가 가능한 코드를 작성하는데 유용한 도구임.
 */

package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        int balance = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("---------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4.종료");
            System.out.println("---------------------");
            System.out.print("선택: ");

            int choice = scanner.nextInt();
            int amount;

            switch (choice) {
                case 1:
                    System.out.print("입금액을 입력하세요: ");
                    amount = scanner.nextInt();
                    balance = deposit(balance, amount);
                    break;
                case 2:
                    System.out.print("출금액을 입력하세요: ");
                    amount = scanner.nextInt();
                    balance = withdraw(balance, amount);
                    break;
                case 3:
                    System.out.println("현재 잔액: "+ balance+"원");
                    break;
                case 4:
                    System.out.println("시스템을 종료합니다.");
                    return;
                default:
                    System.out.println("다시 입력해주세요.");
            }
        }
    }

    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount+"원을 입금하였습니다. 현재 잔액: " + balance+"원");
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려했으나 잔액부족");
        }
        return balance;
    }
}

