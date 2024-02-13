package loop;

public class Continue1 {

    public static void main(String[] args) {
        int i =1;

        while (i <= 5) {
            if (i == 3) {
                i++;
                continue; // 아래의 코드를 무시하고 원래 로 올라가.
            }
            System.out.println(i);
            i++;
        }
    }
}
