//Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
//числом. Подсчитать количество замен.

package Odnomernye_massivy;

import java.util.Scanner;
public class om_2 {
    public static void task2() {
        System.out.println(" Введите количество чисел: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] num = new int[n];
        System.out.println(" Задайте этим числам значения: ");
        for (int i = 0; i < n; i++) {
            num[i] = scan.nextInt();
        }
        System.out.println("Введите число Z: ");
        int z = scan.nextInt();
        int s = 0;
        for (int i = 0; i < n; i++) {
            if (num[i] > z) {
                num[i] = z;
                s++;
            }
        }
        System.out.println("измененная последовательность: ");
        for (int i = 0; i < n; i++) {
            System.out.println(num[i]);
        }
        System.out.println("количество замен: "+ s);
    }
}
