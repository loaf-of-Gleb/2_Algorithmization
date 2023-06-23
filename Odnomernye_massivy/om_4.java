//Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы

package Odnomernye_massivy;

import java.util.Scanner;
public class om_4 {
    public static void task4() {
        System.out.println("Введите количество элементов: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] num = new int[n];
        System.out.println("Задайте значения элементам: ");
        for (int i = 0; i < n; i++) {
            num[i] = scan.nextInt();
        }

        int max = 0;
        int min = 0;
        int storage = 0;
        for (int i = 0; i < n; i++) {
            if (num[max] < num[i]) {
                max = i;
            }
            if (num[min] > num[i]) {
                min = i;
            }
        }
        storage = num[max];
        num[max] = num[min];
        num[min] = storage;

        System.out.println("Итог: ");
        for (int i = 0; i < n; i++) {
            System.out.println(num[i]);
        }
    }
}
