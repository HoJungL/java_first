/*
기존의 코드 기능을 유지하면서
가독성 높이고, 유지보수 용이하게!
 */
package array;

public class Array1Ref4 {

    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50}; // 배열 생성과 초기화
        // 주의사항 : line을 나누면 안됩니당 ㅎ

        // 변수 값 사용
        for (int i = 0; i < students.length; i++) { // ~.length : 배열의 길이까지
            System.out.println("학생" + (i + 1) + "점수: " + students[i]);
        }

    }
}

