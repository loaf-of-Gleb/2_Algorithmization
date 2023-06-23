//Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов.

package Odnomernye_massivy;

import java.util.Scanner;
public class om_3 {
    public static void task3() {
        int m = 0;
        int p = 0;
        int nul = 0;
        System.out.println("Задайте размерность массива: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] num = new int[n];
        System.out.println("Задайте значения элементам массива: ");
        for (int i = 0; i < n; i++) {
            num[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (num[i] > 0) {
                p++;
            }
            if (num[i] < 0) {
                m++;
            }
            if (num[i] == 0) {
                nul++;
            }
        }
        System.out.println("количество отрицательных чисел: " + m);

        System.out.println("положительных чисел: " + p);

        System.out.println("количество нулей " + nul);
    }
}
