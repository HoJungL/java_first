package cond;

public class CondOp2 {

    public static void main(String[] args) {
        int age = 18;
        // ? : ~이냐? 그럼 앞에꺼. 아니면 뒤에꺼!
        String status = (age >= 18) ? "성인" : "미성년자";
        System.out.println("age: " + age + " status: " + status);
    }
}
