package array;

public class ArrayDi1 {

    public static void main(String[] args) {
        int[][] arr = new int[2][3]; //2행 3열

        arr[0][0] = 1; // 0행 0열
        arr[0][1] = 2; // 0행 1열
        arr[0][2] = 3; // 0행 2열
        arr[1][0] = 4; // 1행 0열
        arr[1][1] = 5; // 1행 1열
        arr[1][2] = 6; // 1행 2열


        for (int row = 0; row < 2; row++) {
            for (int columns = 0; columns < 3; columns++) {
                System.out.print(arr[row][columns]+ " ");
            }
            System.out.println();
        }
    }
}
