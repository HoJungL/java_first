package loop;

public class While2_1 {
    public static void main(String[] args) {
        int sum = 0;

        while (sum < 3) {
            sum += 1;
            System.out.println(sum);
            sum += 2;
            System.out.println(sum);
            sum += 3;
            System.out.println(sum);
        }
    }
}
