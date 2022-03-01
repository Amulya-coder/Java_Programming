import java.util.*;

public class NQueen {

    boolean isSafe(int arr[][], int x, int y, int n) {

        // checking for each column row wise
        for (int row = 0; row < x; row++) {

            if (arr[row][y] == 1)
                return false;

        }

        // Upper left diagonal
        int row = x;
        int col = y;

        while (row >= 0 && col >= 0) {
            if (arr[row][col] == 1)
                return false;
            row--;
            col--;
        }

        row = x;
        col = y;

        // Upper right diagonal
        while (row >= 0 && col < n) {
            if (arr[row][col] == 1)
                return false;
            row--;
            col++;
        }

        return true;

    }

    boolean nQueen(int[][] arr, int x, int n) {
        if (x >= n)
            return true;

        for (int col = 0; col < n; col++) {
            if (isSafe(arr, x, col, n)) {
                arr[x][col] = 1;

                if (nQueen(arr, x + 1, n)) {
                    return true;
                }

                arr[x][col] = 0;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = 0;
            }
        }

        NQueen solve = new NQueen();

        if (solve.nQueen(arr, 0, n)) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

        }
    }

}
