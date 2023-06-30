//Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, ..., 2, n
//так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
//собой. Построить такой квадрат

import java.util.Scanner;
public class mm_16 {
    public static void task16() {
    System.out.println(".");
    int[][] matrix;
    Scanner scan = new Scanner(System.in);
        System.out.println("кол-во строк/столбцов кв. матрицы:");
    int n = scan.nextInt();
        if ((n - 1) % 2 == 0) {
        matrix = oddMagicSquare(n);
    } else if (n % 4 == 0) {
        matrix = evenMagicSquare(n);
    } else {
        matrix = evenOddMagicSquare(n);
    }
        for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(matrix[i][j] + "\t");
        }
        System.out.println();
    }
}

    //used in task 16
    private static int[][] oddMagicSquare(int n) {
        int[][] matrix = new int[n][n];
        int i = 0;
        int j = (n - 1) / 2;
        matrix[i--][j++] = 1;
        for (int k = 2; k <= n * n; i--, j++, k++) {
            if (i < 0 && j > n - 1) {
                i += 2;
                j--;
            }
            if (i < 0) {
                i = n - 1;
            }
            if (j > n - 1) {
                j = 0;
            }
            if (matrix[i][j] != 0) {
                i += 2;
                j--;
            }
            matrix[i][j] = k;
        }
        return matrix;
    }

    //used in task 16
    private static int[][] evenMagicSquare(int n) {
        int[][] matrix = new int[n][n];
        int temp;
        int k = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = k;
                k++;
            }
        }

        for (int i = 0; i < n; i += 4) {
            for (int j = 1; j < n; j += 4) {
                matrix[i][j] = n * n + 1 - matrix[i][j];
                matrix[i + 3][j] = n * n + 1 - matrix[i + 3][j];
                matrix[i][j + 1] = n * n + 1 - matrix[i][j + 1];
                matrix[i + 3][j + 1] = n * n + 1 - matrix[i + 3][j + 1];
            }
        }
        for (int i = 1; i < n; i += 4) {
            for (int j = 0; j < n; j += 4) {
                matrix[i][j] = n * n + 1 - matrix[i][j];
                matrix[i + 1][j] = n * n + 1 - matrix[i + 1][j];
                matrix[i][j + 3] = n * n + 1 - matrix[i][j + 3];
                matrix[i + 1][j + 3] = n * n + 1 - matrix[i + 1][j + 3];
            }
        }
        return matrix;
    }

    //used in task 16
    private static int[][] evenOddMagicSquare(int n) {
        int[][] matrix = new int[n][n];
        int[][] squareT = evenMagicSquare(n - 2);
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                matrix[i][j] = squareT[i - 1][j - 1] + 2 * (n - 1);
            }
        }
        int m = n / 2;
        int d = n * n + 1;

        matrix[0][0] = 3 * m - 1;
        matrix[0][n - 1] = 1;
        matrix[n - 1][0] = d - 1;
        matrix[n - 1][n - 1] = d - 3 * m + 1;

        int i, j;
        for (i = 1; i <= m - 2; i++) {
            matrix[0][i] = 2 * i + 1;
        }
        for (j = 1; j <= m; j++) {
            matrix[0][j + i - 1] = d - 2 * j;
        }
        for (j = 1; j < n - 1; j++) {
            matrix[n - 1][j] = n * n + 1 - matrix[0][j];
        }
        matrix[1][0] = 2 * m - 1;
        for (i = 1; i <= m / 2; i++) {
            matrix[i + 1][0] = 3 * m - 1 - i;
        }
        i--;
        for (j = 1; j <= m / 2 + 1; j++) {
            matrix[i + j + 1][0] = d - 4 * m + 1 + j;
        }
        j--;
        for (int q = 1; q <= m / 2 - 1; q++, i++) {
            matrix[i + j + q + 1][0] = 3 * m - 1 + q;
            matrix[i + j + q + 2][0] = d - 2 * m - q;
        }

        for (i = 1; i < n - 1; i++) {
            matrix[i][n - 1] = n * n + 1 - matrix[i][0];
        }

        return matrix;
    }
}
//вроде работает, сойдет...