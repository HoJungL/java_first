package loop;

public class While2_3 {

    public static void main(String[] args) {
        int sum = 0, i = 1, endNum = 3;

        while (i <= endNum) {
            sum += i;
            System.out.println(sum);
            i++;
        }
    }
}
