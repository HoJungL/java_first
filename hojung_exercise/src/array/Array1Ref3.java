/*
기존의 코드 기능을 유지하면서
가독성 높이고, 유지보수 용이하게!
 */
package array;

public class Array1Ref3 {

    public static void main(String[] args) {
        int[] students;
        students = new int[]{90, 80, 70, 60, 50}; // 배열 생성과 초기화
        // int[] students = new int[]{90,80,70,60,50}; 도 가능

        // 변수 값 사용
        for (int i = 0; i < students.length; i++) { // ~.length : 배열의 길이까지
            System.out.println("학생" + (i + 1) + "점수: " + students[i]);
        }

    }
}

