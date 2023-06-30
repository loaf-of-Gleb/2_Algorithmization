//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

import java.util.Scanner;
public class mm_4 {
    public static void task4() {
        int[][] matrix;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите порядок кв. матрицы (четное число):");
        int n = scan.nextInt();
        matrix = new int[n][n];
        int count = 0;
        int countn = 0;
        if (n % 2 == 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i % 2 == 0) {
                        count++;
                        matrix[i][j] = count;
                        System.out.print(matrix[i][j] + "\t");
                    } else {
                        countn++;
                        matrix[i][j] = (n + 1) - countn;
                        System.out.print(matrix[i][j] + "\t");
                    }
                }
                count = 0;
                countn = 0;
                System.out.println();
            }
        }
    }
}
