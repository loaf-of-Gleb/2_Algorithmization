//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

package Odnomernye_massivy;

import java.util.Scanner;
public class om_1 {
    public static void task1() {
        System.out.println("введите количество элементов массива: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] num = new int[n];
        System.out.println("задайте значения элементам массива: ");
        for (int i = 0; i < n; i++) {
            num[i] = scan.nextInt();
        }

        System.out.println("Введите значение К: ");
        int k = scan.nextInt();
        int s = 0;
        for (int i = 0; i < n; i++) {
            if (num[i] % k == 0) {
                s = s + num[i];
            }
        }
        System.out.println("сумма элементов, кратных К = " + s);
    }
}
