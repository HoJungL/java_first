/*
for (첫값; 조건; 할짓)
 */
package loop;

public class Break3 {

    public static void main(String[] args) {
        int sum = 0;

        for (int i =1; ;i++ ) { //for (; ;)는 무한루프임
            sum += i;
            if (sum > 10) {
                System.out.println(i +","+ sum);
                break;
            }
        }
    }
}
