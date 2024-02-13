package array;

public class ArrayDi4 {

    public static void main(String[] args) {
        int[][] arr = new int[3][4];

        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int columns = 0; columns < arr[row].length; columns++) {
                arr[row][columns] = i++;
                System.out.print(arr[row][columns]+ " ");
            }
            System.out.println();
        }
    }
}
