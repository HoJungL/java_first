// 배열을 사용해서 간단하게 만들어 보아요
/*
package array.ex;

public class ArrayEx1 {
    public static void main(String[] args) {
        int student1 = 90;
        int student2 = 80;
        int student3 = 70;
        int student4 = 60;
        int student5 = 50;

        int total = student1 + student2 + student3 + student4 + student5;
        double average = (double) total / 5;

        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
 */




// 일반 for 문
package array.ex;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};

        int total = 0;
        double average = 0;

        // Alt 엔터 -> 향상된 for문으로바꿔볼래? 말해줌.
        for (int i = 0; i < students.length; i++) { //length는 1부터 시작함.
            total += students[i];
            average = (double) total / 5;
        }
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
/*
// 향상된 for 문
package array.ex;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};

        int total = 0;
        double average = 0;

        for (int student : students) {
            total += student;
            average = (double) total / 5;
    }
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
}
 */
