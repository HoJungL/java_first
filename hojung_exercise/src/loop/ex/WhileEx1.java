package loop.ex;

public class WhileEx1 {
    public static void main(String[] args) {
        int count = 0; //count =1

        while (count < 10) { // while (count <=10) 해도 같음
            count++;
            System.out.println(count);
        }
    }
}
