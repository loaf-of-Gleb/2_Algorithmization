//Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить,
// какой столбец содержит максимальную сумму

import java.util.Scanner;
public class mm_9 {
    public static void task9() {
    int[][] matrix;
    Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во строк и столбцов матрицы:");
    int m = scan.nextInt();
    int n = scan.nextInt();
    matrix = new int[m][n];
        System.out.println("Заполните матрицу");
        for (int i = 0; i < m; i++) {
        System.out.println("строка - " + (i + 1));
        for (int j = 0; j < n; j++) {
            matrix[i][j] = scan.nextInt();
        }
    }

    int stolb = 1;
    int sum = 0;
    int maxSum = 0;
        for (int j = 0; j < matrix[0].length; j++) {
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][j];
        }
        System.out.println("сумма " + (j + 1) + " столбца = " + sum);
        if (sum > maxSum) {
            maxSum = sum;
            stolb = j + 1;
        }
        sum = 0;
    }
        System.out.println("максимальная сумма - " + maxSum + " содержится в столбце - " + stolb);
}
}
