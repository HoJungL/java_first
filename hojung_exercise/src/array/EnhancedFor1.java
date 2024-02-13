package array;

public class EnhancedFor1 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        //일반 for 문
        /*
        인덱스를 탐색할 수 있는 변수 선언해야함.
        배열의 끝조건 지정
        인덱스 하나씩 증가시켜야함.
         */
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        // 향상된 for문, for-each문
        /*
        인덱스 사용x, 종료조건 필요없음
        단순히 해당 배열의 처음부터 끝까지 탐색함.
        상당히 가독성이 좋음
         */
        // 첫번째 배열부터 끝 값 까지 모두 보고 넣으시면 됩니다.
        // 실무에서 가장 많이 쓰는 for문
        // 단축기 iter 치고 탭치면 아래의 코드가 나옴. 야무지죠?
        for (int number : numbers) {
            System.out.println(number);
        }


        /*
        for - each 문을 사용할 수 없는 경우, 증가하는 index value 필요
        즉, 인덱스의 직접적인 번호가 필요할때는, 일반적인 for문을 쓰는것이 적절함.

         */

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number" + i + "번의 결과는: " + numbers[i]);
        }
    }
}
