//В числовой матрице поменять местами два любых столбца, т. е. все элементы одного столбца поставить
//на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//пользователь с клавиатуры

import java.util.Scanner;
public class mm_8 {
    public static void task8() {
        int cont = 0;
        int[][] matrix;
        Scanner scan = new Scanner(System.in);
        System.out.println("введите количество строк и столбцов матрицы:");
        int m = scan.nextInt();
        int n = scan.nextInt();
        System.out.println("Введите номера столбцов, которые нужно поменять местами:");
        int k = scan.nextInt() - 1;
        int p = scan.nextInt() - 1;
        matrix = new int[m][n];
        System.out.println("Заполните матрицу:");
        for (int i = 0; i < m; i++) {
            System.out.println("строка - " + (i + 1));
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            cont = matrix[i][k];
            matrix[i][k] = matrix[i][p];
            matrix[i][p] = cont;
        }

        System.out.println("Результат:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
