package loop;

public class Break2 {

    public static void main(String[] args) {
        int sum = 0, i = 1;

        for (; ; ) { //for (; ;)는 무한루프임
            sum += i;
            if (sum > 10) {
                System.out.println(i +","+ sum);
                break;
            }
            i++;
        }
    }
}
