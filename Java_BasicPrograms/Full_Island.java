import java.util.*;

public class Full_Island {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n + 1][n + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > 0 && a[i - 1][j] == 1) {
                    a[i][j] = 0;
                }
                if (i < n - 1 && a[i + 1][j] == 1) {
                    a[i][j] = 0;
                }
                if (j > 0 && a[i][j - 1] == 1) {
                    a[i][j] = 0;
                }
                if (j < n - 1 && a[i][j + 1] == 1) {
                    a[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

}
