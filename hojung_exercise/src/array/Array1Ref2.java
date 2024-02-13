/*
기존의 코드 기능을 유지하면서
가독성 높이고, 유지보수 용이하게!
 */
package array;

public class Array1Ref2 {

    public static void main(String[] args) {
        int[] students;
        students = new int[5];
        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        for (int i = 0; i < students.length; i++) { // ~.length : 배열의 길이까지
            System.out.println("학생" + (i + 1) + "점수: " + students[i]);
        }

    }
}

