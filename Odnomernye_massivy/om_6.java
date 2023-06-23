//Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//являются простыми числами

package Odnomernye_massivy;

import java.util.Scanner;
public class om_6 {
    public static void task6() {
        int s = 0;
        System.out.println("Введите количество элементов: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] num = new int[n];
        System.out.println("Задайте значения элементам: ");
        for (int i = 0; i < n; i++) {
            num[i] = scan.nextInt();
        }

        loop1:
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue loop1;
                }
            }
            s += num[i];
        }
        System.out.println("сумма элементов с простыми номерами = " + s);
    }
}
// я без понятия как и почему это работает......