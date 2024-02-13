package array;

public class ArrayDi3 {

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 2, 3},
                {4, 5, 6}
        }; //2행 3열
        /*
        int[][] arr = {
            {1,2,3},
            {4,5,6}
        }
        도 가능함.
         */

        for (int row = 0; row < arr.length; row++) { //arr.length : 행이 세짐 2개임
            for (int columns = 0; columns < arr[row].length; columns++) { // arr[row].length 해야 열이 세짐 3개임.
                System.out.print(arr[row][columns]+ " ");
            }
            System.out.println();
        }
    }
}
