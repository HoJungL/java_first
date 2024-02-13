package loop;

public class Break1 {

    public static void main(String[] args) {
        int sum = 0, i = 1;

        while (true) {
            sum += i;
            if (sum > 10) {
                System.out.println(i+","+sum);
                break; // break문으로 while 문을 나감.
            }
            i++;
        }
    }
}
